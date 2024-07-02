package com.CanMyChildPlayThisTables;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Sjanger")
public class Sjanger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sjanger_id")
    private int sjanger_id;

    @Column(name = "navn" )
    private String navn;

    @ManyToMany
    @JoinTable(
            name = "SpillSjangere",
            joinColumns = @JoinColumn(name = "sjanger_id"),
            inverseJoinColumns = @JoinColumn(name = "spill_id"))
    private Set<Spill> spillsjangere = new HashSet<>();

    public int getSjanger_id() {
        return sjanger_id;
    }

    public void setSjanger_id(int sjanger_id) {
        this.sjanger_id = sjanger_id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Set<Spill> getSpillsjangere() {
        return spillsjangere;
    }

    public void setSpillsjangere(Set<Spill> spillsjangere) {
        this.spillsjangere = spillsjangere;
    }
}
