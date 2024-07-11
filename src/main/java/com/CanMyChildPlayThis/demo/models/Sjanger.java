package com.CanMyChildPlayThis.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "Sjanger")
public class Sjanger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sjanger_id")
    private int sjanger_id;

    @Column(name = "navn" )
    private String navn;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

}