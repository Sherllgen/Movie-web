package com.example.Backend.repository;

import com.example.Backend.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends JpaRepository<Season, String> {
    // Define custom query methods if needed
    // For example, find seasons by series or other attributes
    Season findBySeasonId(String seasonId);
}
