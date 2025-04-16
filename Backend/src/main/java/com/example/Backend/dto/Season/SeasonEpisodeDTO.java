package com.example.Backend.dto.Season;

import com.example.Backend.dto.Episode.EpisodeDTO;
import com.example.Backend.model.Episode;

import java.util.Set;

public record SeasonEpisodeDTO(
        Long id,
        Long movie_id,
        Integer tmdbSeasonId,
        Integer seasonNumber,
        String title,
        Set<EpisodeDTO> episodes
){
}
