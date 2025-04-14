package com.example.Backend.repository;

import com.example.Backend.model.UserCollectionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCollectionItemRepository extends JpaRepository<UserCollectionItem, String> {
    // Define custom query methods if needed
    // For example, find user collection items by user or movie
    UserCollectionItem findByUserIdAndMovieId(String userId, String movieId);
}
