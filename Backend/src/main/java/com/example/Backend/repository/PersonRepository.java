package com.example.Backend.repository;

import com.example.Backend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Movie, String> {
    // Define custom query methods if needed
    // For example, find movies by title or other attributes
    Movie findByPersonId(String personId);
}
