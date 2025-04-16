package com.example.Backend.dto.Episode;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record EpisodeDTO (
        Long id,
        Integer tmdbEpisodeId,
        Integer episodeNumber,
        String videoUrl,
        LocalDate releaseDate,
        LocalDateTime updatedAt
){
}
