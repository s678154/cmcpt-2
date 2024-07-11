package com.CanMyChildPlayThis.demo.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "Plattform")
public class Plattform {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "plattform_id")
    private int plattform_id;

    @Column(name = "navn" )
    private String navn;

    @ManyToMany
    @JoinTable(
            name = "SpillPlatformer",
            joinColumns = @JoinColumn(name = "plattform_id"),
            inverseJoinColumns = @JoinColumn(name = "spill_id"))
    private Set<Spill> spillplattformer  = new HashSet<>();

    public Plattform(String navn, Set<Spill> spillplattformer) {
        this.navn = navn;
        this.spillplattformer = spillplattformer;
    }

    public Plattform() {
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}