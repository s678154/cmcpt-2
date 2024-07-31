package com.CanMyChildPlayThis.demo.Controllers;

import com.CanMyChildPlayThis.demo.models.Platform;
import com.CanMyChildPlayThis.demo.services.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlatformController {

    @Autowired
    private PlatformService platformService;

    @GetMapping("/platforms")
    @ResponseBody
    public List<Platform> getAllPlatforms() {
        return platformService.getPlatforms();

    }

}
