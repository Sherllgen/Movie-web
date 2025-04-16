package com.example.Backend.dto.WatchHistory;

import com.example.Backend.dto.Movie.MovieDTO;
import com.example.Backend.model.Movie;
import com.example.Backend.model.WatchHistory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class WatchHistoryDTOConverter {
    public WatchHistoryDTOConverter (){}

    public WatchHistoryDTO convert(WatchHistory from) {
        return new WatchHistoryDTO(
                from.getId(),
                from.getUser().getId(),
                from.getMovie().getId(),
                from.getSeason() != null ? from.getSeason().getId() : null,
                from.getEpisode() != null ? from.getEpisode().getId() : null,
                from.getProgress(),
                from.getWatchedAt().toString()
        );
    }

    public List<WatchHistoryDTO> convert(List<WatchHistory> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<WatchHistoryDTO> convert(Optional<WatchHistory> from) {
        return from.map(this::convert);
    }
}
