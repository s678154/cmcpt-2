package com.CanMyChildPlayThis.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "Aldersgrense")
public class Aldersgrense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aldersgrense_id")
    private int aldersgrense_id;

    @Column(name = "beskrivelse", nullable = false)
    private int alder;

    public Aldersgrense(int alder) {
        this.alder = alder;
    }

    public Aldersgrense() {
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}