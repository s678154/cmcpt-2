package com.CanMyChildPlayThis.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Producer")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producer_id")
    private int producerId;

    @Column(name = "name")
    private String name;

    public void setId(int id) {
        this.producerId = id;
    }

    public int getId() {
        return producerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
