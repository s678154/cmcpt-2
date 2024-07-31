package com.CanMyChildPlayThis.demo.repositories;

import com.CanMyChildPlayThis.demo.models.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformRepository extends JpaRepository<Platform, Integer> {
}
