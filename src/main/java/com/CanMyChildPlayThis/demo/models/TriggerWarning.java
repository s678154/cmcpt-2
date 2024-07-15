package com.CanMyChildPlayThis.demo.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TriggerWarning")
public class TriggerWarning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trigger_warning_id")
    private int triggerWarningId;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany(mappedBy = "triggerWarningSet")
    private final Set<Game> gameSet = new HashSet<>();

    public TriggerWarning(String description) {
        this.description = description;
    }

    public TriggerWarning() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
