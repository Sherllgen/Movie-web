package com.example.Backend.dto.Role;

import com.example.Backend.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RoleDTOConverter {
    public RoleDTOConverter() {
    }
    
    public RoleDTO convert(Role from) {
        return new RoleDTO(
                from.getId(),
                from.getName());
    }

    public List<RoleDTO> convert(List<Role> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<RoleDTO> convert(Optional<Role> from) {
        return from.map(this::convert);
    }
}
