package com.example.Backend.model;

import com.example.Backend.model.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String profileUrl;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthday;
}
