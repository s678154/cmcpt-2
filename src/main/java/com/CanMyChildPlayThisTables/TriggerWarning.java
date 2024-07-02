package com.CanMyChildPlayThisTables;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class TriggerWarning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trigger_warning_id")
    private int trigger_warning_id;

    @Column(name = "beskrivelse", nullable = false)
    private String beskrivelse;

    @ManyToMany (mappedBy = "triggerwarnings")
    private Set<Spill> spilltriggerwarnings;
    //Gettere og settere
}
