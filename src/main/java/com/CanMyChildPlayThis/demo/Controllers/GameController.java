package com.CanMyChildPlayThis.demo.Controllers;

import com.CanMyChildPlayThis.demo.models.Game;
import com.CanMyChildPlayThis.demo.models.Genre;
import com.CanMyChildPlayThis.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public List<Game> index() {
        return gameService.getAllGames();
    }

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }
}
