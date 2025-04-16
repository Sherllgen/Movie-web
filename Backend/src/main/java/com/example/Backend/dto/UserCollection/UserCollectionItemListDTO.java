package com.example.Backend.dto.UserCollection;

import com.example.Backend.dto.UserCollectionItem.UserCollectionItemDTO;
import com.example.Backend.model.enums.CollectionType;

import java.time.LocalDateTime;
import java.util.Set;

public record UserCollectionItemListDTO (
        Long id,
        Long user_id,
        String name,
        CollectionType type,
        Set<UserCollectionItemDTO> items
){
}
