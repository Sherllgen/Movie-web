package com.example.Backend.dto.Comment;

import java.time.LocalDateTime;
import java.util.Set;

public record CommentDTO (
        Long id,
        Long user_id,
        Long movie_id,
        Long parentCommentId,
        Set<CommentDTO> replies,
        String content,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
){
}
