package com.example.Backend.repository;

import com.example.Backend.model.UserCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCollectionRepository extends JpaRepository<UserCollection, String> {
    // Define custom query methods if needed
    // For example, find collections by user or other attributes
    UserCollection findByUserId(String userId);
}
