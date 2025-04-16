package com.example.Backend.dto.Genre;

import com.example.Backend.dto.Movie.MovieDTO;

import java.util.Set;

public record GenreDTO (
        Long id,
        String name,
        String description
) {
}
