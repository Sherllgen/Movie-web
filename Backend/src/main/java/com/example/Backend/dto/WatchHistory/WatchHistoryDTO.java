package com.example.Backend.dto.WatchHistory;

public record WatchHistoryDTO (
        Long id,
        Long user_id,
        Long movie_id,
        Long season_id,
        Long episode_id,
        Integer progress,
        String watchedAt
){
}
