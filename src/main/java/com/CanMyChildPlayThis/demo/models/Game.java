package com.CanMyChildPlayThis.demo.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private int gameId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "release_date", nullable = false)
    private Date releaseDate;

    @Column(name = "image_url")
    private String imageUrl;

    // Many-to-one relationship to age rating, producer, review
    @ManyToOne
    @JoinColumn(name = "age_rating_id", nullable = false)
    private AgeRating ageRating;

    @ManyToOne
    @JoinColumn(name = "producer_id", nullable = false)
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

    @ManyToMany
    @JoinTable(
            name = "GameTriggerWarnings",
            joinColumns = @JoinColumn(name = "game_id", referencedColumnName = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "trigger_warning_id", referencedColumnName = "trigger_warning_id"))
    private Set<TriggerWarning> triggerWarningSet = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "GamePlatforms",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "platform_id"))
    private Set<Platform> platformSet = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "GameGenres",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genreSet = new HashSet<>();

    public Game(String title, double price, String size, String description, Date releaseDate, String imageUrl, AgeRating ageRating, Producer producer, Review review, Set<TriggerWarning> triggerWarningSet, Set<Platform> platformSet, Set<Genre> genreSet) {
        this.title = title;
        this.price = price;
        this.size = size;
        this.description = description;
        this.releaseDate = releaseDate;
        this.imageUrl = imageUrl;
        this.ageRating = ageRating;
        this.producer = producer;
        this.review = review;
        this.triggerWarningSet = triggerWarningSet;
        this.platformSet = platformSet;
        this.genreSet = genreSet;
    }
    public Game() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(AgeRating ageRating) {
        this.ageRating = ageRating;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Set<TriggerWarning> getTriggerWarningSet() {
        return triggerWarningSet;
    }

    public void setTriggerWarningSet(Set<TriggerWarning> triggerWarningSet) {
        this.triggerWarningSet = triggerWarningSet;
    }

    public Set<Platform> getPlatformSet() {
        return platformSet;
    }

    public void setPlatformSet(Set<Platform> platformSet) {
        this.platformSet = platformSet;
    }

    public Set<Genre> getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(Set<Genre> genreSet) {
        this.genreSet = genreSet;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", ageRating=" + ageRating +
                ", producer=" + producer +
                ", review=" + review +
                ", triggerWarningSet=" + triggerWarningSet +
                ", platformSet=" + platformSet +
                ", genreSet=" + genreSet +
                '}';
    }
}
