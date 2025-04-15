package com.example.Backend.dto.Season;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record SeasonDTO (
         Long id,
         Integer tmdbSeasonId,
         Integer seasonNumber,
         LocalDate releaseDate,
         String title,
         Integer episodeCount,
         String posterPath,
         Double voteAverage,
         Integer voteCount,
         LocalDateTime updatedAt
){
}
