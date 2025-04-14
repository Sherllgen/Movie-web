package com.example.Backend.repository;

import com.example.Backend.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, String> {
    // Define custom query methods if needed
    // For example, find episodes by series or other attributes
    Episode findByEpisodeId(String episodeId);
}
