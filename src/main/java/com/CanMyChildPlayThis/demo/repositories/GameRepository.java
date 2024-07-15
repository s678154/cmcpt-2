package com.CanMyChildPlayThis.demo.repositories;

import com.CanMyChildPlayThis.demo.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {
}
