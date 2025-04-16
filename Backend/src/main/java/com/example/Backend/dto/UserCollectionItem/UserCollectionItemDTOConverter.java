package com.example.Backend.dto.UserCollectionItem;

import com.example.Backend.model.UserCollectionItem;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserCollectionItemDTOConverter {
    public UserCollectionItemDTO convert(UserCollectionItem from) {
        return new UserCollectionItemDTO(
                from.getId(),
                from.getUserCollection().getId(),
                from.getMovie().getId(),
                from.getAddedAt()
        );
    }

    public List<UserCollectionItemDTO> convert(List<UserCollectionItem> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<UserCollectionItemDTO> convert(Optional<UserCollectionItem> from) {
        return from.map(this::convert);
    }
}
