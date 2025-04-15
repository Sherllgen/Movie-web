package com.example.Backend.dto.Season;


import com.example.Backend.model.Season;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class SeasonDTOConverter {
    public SeasonDTOConverter (){}

    public SeasonDTO convert(Season from) {
        return new SeasonDTO(
                from.getId(),
                from.getTmdbSeasonId(),
                from.getSeasonNumber(),
                from.getReleaseDate(),
                from.getTitle(),
                from.getEpisodeCount(),
                from.getPosterPath(),
                from.getVoteAverage(),
                from.getVoteCount(),
                from.getUpdatedAt());
    }

    public List<SeasonDTO> convert(List<Season> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<SeasonDTO> convert(Optional<Season> from) {
        return from.map(this::convert);
    }
}
