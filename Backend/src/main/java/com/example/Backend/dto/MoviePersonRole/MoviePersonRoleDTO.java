package com.example.Backend.dto.MoviePersonRole;

import com.example.Backend.model.enums.PersonRole;

public record MoviePersonRoleDTO (
        Long id,
        Long person_id,
        Long movie_id,
        PersonRole role,
        String characterName
){
}
