package com.example.Backend.dto.Season;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record SeasonDTO (
         Long id,
         Long movie_id,
         Integer tmdbSeasonId,
         Integer seasonNumber,
         String title,
         Integer episodeCount,
         String posterPath,
         Double voteAverage,
         Integer voteCount,
         LocalDate releaseDate,
         LocalDateTime updatedAt
){
}
