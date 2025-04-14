package com.example.Backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.context.event.SpringApplicationEvent;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString(exclude = {"user", "movie", "season", "episode"})
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "watch_history",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"user_id", "movie_id", "season_id", "episode_id"})
        })
public class WatchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToOne
    @JoinColumn(name = "episode_id")
    private Episode episode;

    private Integer progress = 0;

    private LocalDateTime watchedAt;

    @PrePersist
    protected void onCreate() {
        watchedAt = LocalDateTime.now();
    }
}
