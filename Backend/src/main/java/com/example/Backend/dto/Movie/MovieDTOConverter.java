package com.example.Backend.dto.Movie;

import com.example.Backend.dto.Genre.GenreDTO;
import com.example.Backend.dto.Genre.GenreDTOConverter;
import com.example.Backend.dto.Role.RoleDTO;
import com.example.Backend.dto.Role.RoleDTOConverter;
import com.example.Backend.dto.Movie.MovieDTO;
import com.example.Backend.model.Movie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MovieDTOConverter {
    private final GenreDTOConverter genreDTOConverter;

    public MovieDTOConverter(GenreDTOConverter genreDTOConverter) {
        this.genreDTOConverter = genreDTOConverter;
    }

    public MovieDTO convert(Movie from) {
        Set<GenreDTO> roleDTOs = from.getGenres()
                .stream()
                .map(genreDTOConverter::convert)
                .collect(Collectors.toSet());

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
                roleDTOs
        );

    }

    public List<MovieDTO> convert(List< Movie > from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<MovieDTO> convert(Optional<Movie> from) {
        return from.map(this::convert);
    }
}
