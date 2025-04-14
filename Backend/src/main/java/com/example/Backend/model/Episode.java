package com.example.Backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString(exclude = {"season"})
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "episode",
uniqueConstraints = {
        @UniqueConstraint(columnNames = {"episode_number", "season_id"})
    })
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer episodeNumber;

    private String videoUrl;

    private LocalDate releaseDate;

    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "season_id", nullable = false)
    private Season season;

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
