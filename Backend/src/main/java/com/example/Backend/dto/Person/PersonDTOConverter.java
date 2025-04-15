package com.example.Backend.dto.Person;
import com.example.Backend.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PersonDTOConverter {
    public PersonDTOConverter() {
    }

    public PersonDTO convert(Person from) {
        return new PersonDTO(
                from.getId(),
                from.getName(),
                from.getProfileUrl(),
                from.getGender(),
                from.getBirthday());
    }

    public List<PersonDTO> convert(List<Person> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<PersonDTO> convert(Optional<Person> from) {
        return from.map(this::convert);
    }
}
