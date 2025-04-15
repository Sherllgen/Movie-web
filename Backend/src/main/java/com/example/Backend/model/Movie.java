package com.example.Backend.model;

import com.example.Backend.model.enums.MovieStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString(exclude = {"genres", "seasons", "moviePersonRoles", "comments"})
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private Integer tmdbMovieId;

    @Column(nullable = false)
    private String title;

    private String originalTitle;

    private String posterPath;

    private String backdropPath;

    @Column(columnDefinition = "TEXT")
    private String overview;

    @Column(precision = 3, scale = 1)
    private Double voteAverage;

    private Integer voteCount = 0;

    @Column(precision = 3, scale = 1)
    private Double imdbScore;

    private Integer viewCount = 0;

    private Boolean isSeries = false;

    private Integer releaseYear;

    private Integer duration;

    private String country;

    @Enumerated(EnumType.STRING)
    private MovieStatus status = MovieStatus.RELEASED;

    private LocalDateTime updatedAt;

    @ManyToMany
    @JoinTable(
            name = "movie_genres",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres = new HashSet<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<Season> seasons = new HashSet<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<MoviePersonRole> moviePersonRoles = new HashSet<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<Comment> comments = new HashSet<>();

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
