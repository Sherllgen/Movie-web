package com.example.Backend.dto.User;

import com.example.Backend.dto.Role.RoleDTO;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public record UserDTO (
        Long id,
        String userName,
        String email,
        String accountName,
        String avatar,
        Boolean isActive,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Set<RoleDTO> roles){

}
