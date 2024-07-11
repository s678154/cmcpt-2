package com.CanMyChildPlayThis.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "Produsent")
public class Produsent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produsent_id")
    private int produsent_id;

    @Column(name = "navn" )
    private String navn;

    public void setId(int id) {
        this.produsent_id = id;
    }

    public int getId() {
        return produsent_id;
    }
}
