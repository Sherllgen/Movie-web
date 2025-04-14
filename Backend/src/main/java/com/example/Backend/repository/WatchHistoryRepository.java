package com.example.Backend.repository;

import com.example.Backend.model.WatchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchHistoryRepository extends JpaRepository <WatchHistory, String> {
    WatchHistory findByUserId(String userId);
    void deleteByUserId(String userId);
    void deleteByMovieIdAndUserId(String movieId, String userId);
}
