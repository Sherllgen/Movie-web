package com.example.Backend.dto.UserCollection;

import com.example.Backend.dto.UserCollectionItem.UserCollectionItemDTO;
import com.example.Backend.dto.UserCollectionItem.UserCollectionItemDTOConverter;
import com.example.Backend.model.UserCollection;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserCollectionItemListDTOConverter {
    private final UserCollectionItemDTOConverter userCollectionItemDTOConverter;
    public UserCollectionItemListDTOConverter ( UserCollectionItemDTOConverter userCollectionItemDTOConverter) {
        this.userCollectionItemDTOConverter = userCollectionItemDTOConverter;
    }

    public UserCollectionItemListDTO convert(UserCollection from) {
        Set<UserCollectionItemDTO> items = from.getItems().stream()
                .map(userCollectionItemDTOConverter::convert)
                .collect(Collectors.toSet());

        return new UserCollectionItemListDTO(
                from.getId(),
                from.getUser().getId(),
                from.getName(),
                from.getType(),
                items
        );
    }

    public List<UserCollectionItemListDTO> convert(List<UserCollection> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<UserCollectionItemListDTO> convert(Optional<UserCollection> from) {
        return from.map(this::convert);
    }

}
