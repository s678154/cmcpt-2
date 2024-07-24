package com.CanMyChildPlayThis.demo.repositories;

import com.CanMyChildPlayThis.demo.models.AgeRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeRatingRepository extends JpaRepository<AgeRating, Integer> {
}
