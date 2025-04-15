package com.example.Backend.dto.Person;

import com.example.Backend.model.enums.Gender;

import java.time.LocalDate;

public record PersonDTO (Long id,
                         String name,
                         String profileUrl,
                         Gender gender,
                         LocalDate birthday){
}
