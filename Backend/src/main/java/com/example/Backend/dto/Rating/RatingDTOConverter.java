package com.example.Backend.dto.Rating;


import com.example.Backend.model.Rating;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RatingDTOConverter {
    public RatingDTOConverter(){}

    public RatingDTO convert(Rating from) {
        return new RatingDTO(
                from.getId(),
                from.getUser().getId(),
                from.getMovie().getId(),
                from.getSeason() != null ? from.getSeason().getId() : null,
                from.getScore(),
                from.getReview(),
                from.getCreatedAt(),
                from.getUpdatedAt()
        );
    }

    public List<RatingDTO> convert(List<Rating> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }

    public Optional<RatingDTO> convert(Optional<Rating> from) {
        return from.map(this::convert);
    }
}
