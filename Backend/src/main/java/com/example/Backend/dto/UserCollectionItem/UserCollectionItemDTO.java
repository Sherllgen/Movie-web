package com.example.Backend.dto.UserCollectionItem;

import com.example.Backend.model.Movie;
import com.example.Backend.model.UserCollection;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public record UserCollectionItemDTO(
        Long id,
        Long collection_id,
        Long movie_id,
        LocalDateTime addedAt
) {
}
