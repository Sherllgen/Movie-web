package com.example.Backend.model;

import com.example.Backend.model.enums.PersonRole;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString(exclude = {"person", "movie"})
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "movie_person_role",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"person_id", "movie_id"})
        })
public class MoviePersonRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PersonRole role;

    private String characterName;

}
