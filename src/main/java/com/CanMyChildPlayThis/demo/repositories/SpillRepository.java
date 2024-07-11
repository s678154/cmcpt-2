package com.CanMyChildPlayThis.demo.repositories;

import com.CanMyChildPlayThis.demo.models.Spill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpillRepository extends JpaRepository<Spill,Integer> {
}
