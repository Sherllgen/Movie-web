package com.example.Backend.dto.Episode;

import com.example.Backend.model.Episode;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EpisodeDTOConverter {
    public EpisodeDTOConverter() {
    }

    public EpisodeDTO convert(Episode from) {
        return new EpisodeDTO(
                from.getId(),
                from.getTmdbEpisodeId(),
                from.getEpisodeNumber(),
                from.getVideoUrl(),
                from.getReleaseDate(),
                from.getUpdatedAt()
        );
    }

    public List<EpisodeDTO> convert(List<Episode> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<EpisodeDTO> convert(Optional<Episode> from) {
        return from.map(this::convert);
    }
}
