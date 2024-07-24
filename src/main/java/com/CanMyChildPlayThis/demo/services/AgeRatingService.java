package com.CanMyChildPlayThis.demo.services;

import com.CanMyChildPlayThis.demo.models.AgeRating;
import com.CanMyChildPlayThis.demo.models.Genre;
import com.CanMyChildPlayThis.demo.repositories.AgeRatingRepository;
import com.CanMyChildPlayThis.demo.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgeRatingService {
    @Autowired
    private AgeRatingRepository ageRatingRepository;

    public List<AgeRating> getAllAgeRatings() {
        return ageRatingRepository.findAll();
    }
}
