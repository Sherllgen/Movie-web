package com.example.Backend.dto.UserCollection;

import com.example.Backend.model.UserCollection;
import com.example.Backend.model.UserCollectionItem;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserCollectionDTOConverter {
    public UserCollectionDTOConverter () {
    }

    public UserCollectionDTO convert(UserCollection from) {
        return new UserCollectionDTO(
                from.getId(),
                from.getUser().getId(),
                from.getName(),
                from.getType(),
                from.getCreatedAt(),
                from.getUpdatedAt(),
                from.getItems()
                        .stream()
                        .map(UserCollectionItem::getId)
                        .collect(Collectors.toSet())
        );
    }

    public List<UserCollectionDTO> convert(List<UserCollection> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<UserCollectionDTO> convert(Optional<UserCollection> from) {
        return from.map(this::convert);
    }

}
