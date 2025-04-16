package com.example.Backend.dto.Rating;

import java.time.LocalDateTime;

public record RatingDTO (
         Long id,
         Long user_id,
         Long movie_id,
         Long season_id,
         Double score,
         String review,
         LocalDateTime createdAt,
         LocalDateTime updatedAt
) {
}
