package com.CanMyChildPlayThis.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "AgeRating")
public class AgeRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "age_rating_id")
    private int ageRatingId;

    @Column(name = "description", nullable = false)
    private int age;

    public AgeRating(int age) {
        this.age = age;
    }

    public AgeRating() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
