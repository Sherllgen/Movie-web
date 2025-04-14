package com.example.Backend.repository;

import com.example.Backend.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {
    // Define custom query methods if needed
    // For example, find ratings by user or movie
    Rating findByUserIdAndMovieId(String userId, String movieId);
}
