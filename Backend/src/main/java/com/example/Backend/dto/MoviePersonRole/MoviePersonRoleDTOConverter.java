package com.example.Backend.dto.MoviePersonRole;


import com.example.Backend.model.MoviePersonRole;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class MoviePersonRoleDTOConverter {
    public MoviePersonRoleDTOConverter(){}

    public MoviePersonRoleDTO convert(MoviePersonRole from) {
        return new MoviePersonRoleDTO(
                from.getId(),
                from.getPerson().getId(),
                from.getMovie().getId(),
                from.getRole(),
                from.getCharacterName()
        );
    }

    public List<MoviePersonRoleDTO> convert(List<MoviePersonRole> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<MoviePersonRoleDTO> convert(Optional<MoviePersonRole> from) {
        return from.map(this::convert);
    }
}
