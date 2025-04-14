package com.example.Backend.repository;

import com.example.Backend.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
    Comment findByCommentId(String commentId);
    void deleteByCommentId(String commentId);
    void deleteByMovieIdAndUserId(String movieId, String userId);
    Comment findByMovieIdAndUserId(String movieId, String userId);
}
