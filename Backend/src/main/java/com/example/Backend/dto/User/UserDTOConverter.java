package com.example.Backend.dto.User;

import com.example.Backend.dto.Role.RoleDTO;
import com.example.Backend.dto.Role.RoleDTOConverter;
import com.example.Backend.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserDTOConverter {

    private final RoleDTOConverter roleDTOConverter;

    public UserDTOConverter(RoleDTOConverter roleDTOConverter) {
        this.roleDTOConverter = roleDTOConverter;
    }

    public UserDTO convert(User from) {
        Set<RoleDTO> roleDTOs = from.getRoles()
                .stream()
                .map(roleDTOConverter::convert)
                .collect(Collectors.toSet());

        return new UserDTO(
                from.getId(),
                from.getUserName(),
                from.getEmail(),
                from.getAccountName(),
                from.getAvatar(),
                from.getIsActive(),
                from.getCreatedAt(),
                from.getUpdatedAt(),
                roleDTOs
        );

    }

    public List<UserDTO> convert(List< User > from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<UserDTO> convert(Optional<User> from) {
        return from.map(this::convert);
    }
}
