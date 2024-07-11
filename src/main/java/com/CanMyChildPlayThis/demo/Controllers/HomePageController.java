package com.CanMyChildPlayThis.demo.Controllers;

import com.CanMyChildPlayThis.demo.services.SpillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomePageController {
@Autowired
private SpillService spillService;

    @GetMapping("/test")
    public String index() {
        System.out.println("1");
        System.out.println(spillService.getAllGames());
        System.out.println("2");
        return "index";
    }

}
