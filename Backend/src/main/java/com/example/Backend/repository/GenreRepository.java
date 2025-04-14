package com.example.Backend.repository;

import com.example.Backend.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, String> {
    Genre findByGenreId(String genreId);
    Genre findByName(String name);
    void deleteByName(String name);
    void deleteByGenreId(String genreId);
}
