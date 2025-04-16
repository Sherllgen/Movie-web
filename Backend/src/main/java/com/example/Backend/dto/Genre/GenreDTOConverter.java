package com.example.Backend.dto.Genre;

import com.example.Backend.model.Genre;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class GenreDTOConverter {
    public GenreDTOConverter() {}

    public GenreDTO convert(Genre from) {
        return new GenreDTO(
                from.getId(),
                from.getName(),
                from.getDescription()
        );
    }

    public List<GenreDTO> convert(List<Genre> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<GenreDTO> convert(Optional<Genre> from) {
        return from.map(this::convert);
    }
}
