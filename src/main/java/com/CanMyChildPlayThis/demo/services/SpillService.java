package com.CanMyChildPlayThis.demo.services;

import com.CanMyChildPlayThis.demo.models.Spill;
import com.CanMyChildPlayThis.demo.repositories.SpillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpillService {

    @Autowired
    private SpillRepository spillRepository;

    public List<Spill> getAllGames() {
       return spillRepository.findAll();
    }

    public Spill getGameById(int id) {
        Optional<Spill> optionalSpill = spillRepository.findById(id);
        return optionalSpill.orElse(null);
    }
}
