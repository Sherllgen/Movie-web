package com.example.Backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString(exclude = {"movie", "episodes"})
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "season",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"season_number", "movie_id"})
    })
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer seasonNumber;

    private String title;

    private Integer episodeCount = 0;

    private String posterPath;

    @Column(precision = 3, scale = 1)
    private Double voteAverage;

    private Integer voteCount = 0;

    private LocalDate releaseDate;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL)
    private Set<Episode> episodes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @PrePersist
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
