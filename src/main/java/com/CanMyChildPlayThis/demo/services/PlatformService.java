package com.CanMyChildPlayThis.demo.services;

import com.CanMyChildPlayThis.demo.models.Platform;
import com.CanMyChildPlayThis.demo.repositories.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformService {

    @Autowired
    private PlatformRepository platformRepository;

    public List<Platform> getPlatforms() {
        return platformRepository.findAll();
    }

}
