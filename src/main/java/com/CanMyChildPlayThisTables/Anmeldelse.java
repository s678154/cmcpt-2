package com.CanMyChildPlayThisTables;

import jakarta.persistence.*;

@Entity
@Table(name = "Anmeldelse")
public class Anmeldelse {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "anmeldelse_id")
    private int anmeldelse_id;

    @Column(name = "vurdering" )
    private int vurdering;

    public Anmeldelse(int vurdering) {
        this.vurdering = vurdering;
    }

    public Anmeldelse() {
    }

    public int getVurdering() {
        return vurdering;
    }

    public void setVurdering(int vurdering) {
        this.vurdering = vurdering;
    }
}
