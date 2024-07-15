package com.CanMyChildPlayThis.demo.Controllers;

import com.CanMyChildPlayThis.demo.models.Game;
import com.CanMyChildPlayThis.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    @ResponseBody
    public List<Game> index() {
        return gameService.getAllGames();
    }

    @GetMapping("/games/{id}")
    @ResponseBody
    public Game getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }
}
