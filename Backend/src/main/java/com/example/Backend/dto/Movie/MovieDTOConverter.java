package com.example.Backend.dto.Movie;

import com.example.Backend.model.Genre;
import com.example.Backend.model.Movie;
import com.example.Backend.model.Season;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class MovieDTOConverter {
    public MovieDTOConverter() {}

    public MovieDTO convert(Movie from) {
        return new MovieDTO (
                from.getId(),
                from.getTmdbMovieId(),
                from.getTitle(),
                from.getOriginalTitle(),
                from.getPosterPath(),
                from.getBackdropPath(),
                from.getOverview(),
                from.getVoteAverage(),
                from.getVoteCount(),
                from.getImdbScore(),
                from.getViewCount(),
                from.getIsSeries(),
                from.getReleaseYear(),
                from.getDuration(),
                from.getCountry(),
                from.getStatus(),
                from.getUpdatedAt(),
                from.getGenres()
                        .stream()
                        .map(Genre::getId)
                        .collect(Collectors.toSet()),
                from.getSeasons()
                        .stream()
                        .map(Season::getId)
                        .collect(Collectors.toSet())

        );

    }

    public List<MovieDTO> convert(List< Movie > from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<MovieDTO> convert(Optional<Movie> from) {
        return from.map(this::convert);
    }
}
