package com.example.Backend.repository;

import com.example.Backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    // Define custom query methods if needed
    // For example, find roles by name or other attributes
    Role findByName(String name);
}
