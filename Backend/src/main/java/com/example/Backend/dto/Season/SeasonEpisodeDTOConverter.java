package com.example.Backend.dto.Season;

import com.example.Backend.dto.Episode.EpisodeDTO;
import com.example.Backend.dto.Episode.EpisodeDTOConverter;
import com.example.Backend.dto.Genre.GenreDTO;
import com.example.Backend.model.Season;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SeasonEpisodeDTOConverter {
    private final EpisodeDTOConverter episodeDTOConverter;


    public SeasonEpisodeDTOConverter (EpisodeDTOConverter episodeDTOConverter){
        this.episodeDTOConverter = episodeDTOConverter;
    }

    public SeasonEpisodeDTO convert(Season from) {
        Set<EpisodeDTO> episodeDTOs = from.getEpisodes()
                .stream()
                .map(episodeDTOConverter::convert)
                .collect(Collectors.toSet());
        return new SeasonEpisodeDTO(
                from.getId(),
                from.getMovie().getId(),
                from.getTmdbSeasonId(),
                from.getSeasonNumber(),
                from.getTitle(),
                episodeDTOs
        );
    }
}
