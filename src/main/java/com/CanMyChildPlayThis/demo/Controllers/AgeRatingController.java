package com.CanMyChildPlayThis.demo.Controllers;

import com.CanMyChildPlayThis.demo.models.AgeRating;
import com.CanMyChildPlayThis.demo.models.Genre;
import com.CanMyChildPlayThis.demo.services.AgeRatingService;
import com.CanMyChildPlayThis.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class AgeRatingController {
    @Autowired
    private AgeRatingService ageRatingService;

    @GetMapping("/age-ratings")
    @ResponseBody
    public List<AgeRating> getAllAgeRatings() {
        return ageRatingService.getAllAgeRatings();
    }
}
