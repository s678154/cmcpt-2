package com.CanMyChildPlayThis.demo.services;

import com.CanMyChildPlayThis.demo.models.Game;
import com.CanMyChildPlayThis.demo.models.Genre;
import com.CanMyChildPlayThis.demo.repositories.GameRepository;
import com.CanMyChildPlayThis.demo.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GenreRepository genreRepository;

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(int id) {
        Optional<Game> optionalGame = gameRepository.findById(id);
        return optionalGame.orElse(null);
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}

