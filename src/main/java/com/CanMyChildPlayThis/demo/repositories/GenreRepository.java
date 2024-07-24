package com.CanMyChildPlayThis.demo.repositories;

import com.CanMyChildPlayThis.demo.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
