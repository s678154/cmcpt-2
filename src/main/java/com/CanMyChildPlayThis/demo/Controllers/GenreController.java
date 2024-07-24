package com.CanMyChildPlayThis.demo.Controllers;

import com.CanMyChildPlayThis.demo.models.Genre;
import com.CanMyChildPlayThis.demo.services.GameService;
import com.CanMyChildPlayThis.demo.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping("/genres")
    @ResponseBody
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

}
