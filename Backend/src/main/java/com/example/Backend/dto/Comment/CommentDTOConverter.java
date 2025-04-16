package com.example.Backend.dto.Comment;

import com.example.Backend.model.Comment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CommentDTOConverter {
    public CommentDTOConverter (){}

    public CommentDTO convert(Comment from) {
        return new CommentDTO(
                from.getId(),
                from.getUser().getId(),
                from.getMovie().getId(),
                from.getParentComment() != null ? from.getParentComment().getId() : null,
                from.getReplies()
                        .stream()
                        .map(this::convert)
                        .collect(Collectors.toSet()),
                from.getContent(),
                from.getCreatedAt(),
                from.getUpdatedAt()
        );
    }

    public List<CommentDTO> convert(List<Comment> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<CommentDTO> convert(Optional<Comment> from) {
        return from.map(this::convert);
    }
}
