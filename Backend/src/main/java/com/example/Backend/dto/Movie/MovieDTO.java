package com.example.Backend.dto.Movie;


import com.example.Backend.dto.Genre.GenreDTO;
import com.example.Backend.dto.Season.SeasonDTO;
import com.example.Backend.model.Season;
import com.example.Backend.model.enums.MovieStatus;

import java.time.LocalDateTime;
import java.util.Set;

public record MovieDTO(
        Long id,
        Integer tmdbMovieId,
        String title,
        String originalTitle,
        String posterPath,
        String backdropPath,
        String overview,
        Double voteAverage,
        Integer voteCount,
        Double imdbScore,
        Integer viewCount,
        Boolean isSeries,
        Integer releaseYear,
        Integer duration,
        String country,
        MovieStatus status,
        LocalDateTime updatedAt,
        Set<Long> genreIds,
        Set<Long> seasonIds) {
}
