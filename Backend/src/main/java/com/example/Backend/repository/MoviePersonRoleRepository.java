package com.example.Backend.repository;

import com.example.Backend.model.MoviePersonRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviePersonRoleRepository extends JpaRepository<MoviePersonRole, String> {
    // Custom query methods can be defined here if needed
    // For example, find by movie ID or person ID
    MoviePersonRole findByMovieIdAndPersonId(String movieId, String personId);
}
