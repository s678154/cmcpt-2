package com.CanMyChildPlayThis.demo.services;

import com.CanMyChildPlayThis.demo.models.Genre;
import com.CanMyChildPlayThis.demo.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
