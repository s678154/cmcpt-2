package com.CanMyChildPlayThisTables;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TriggerWarning")
public class TriggerWarning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trigger_warning_id")
    private int trigger_warning_id;

    @Column(name = "beskrivelse", nullable = false)
    private String beskrivelse;
    //Gettere og settere


    public TriggerWarning(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
    public TriggerWarning() {}

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
}
