package com.CanMyChildPlayThis.demo.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Platform")
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platform_id")
    private int platformId;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "GamePlatforms",
            joinColumns = @JoinColumn(name = "platform_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id"))
    private Set<Game> games = new HashSet<>();

    public Platform(String name, Set<Game> games) {
        this.name = name;
        this.games = games;
    }

    public Platform() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
