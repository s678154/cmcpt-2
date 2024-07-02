package com.CanMyChildPlayThisTables;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Spill")
public class Spill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spill_id")
    private int spill_id;

    @Column(name = "tittel", nullable = false)
    private String tittel;

    @Column(name = "pris", nullable = false)
    private double pris;

    @Column(name = "storrelse", nullable = false)
    private String storrelse;

    @Column(name = "beskrivelse", nullable = false)
    private String beskrivelse;

    @Column(name = "utgivelse", nullable = false)
    private Date utgivelse;

    @Column(name = "bilde_url")
    private String bilde_url;

    //Mange til en relasjon til aldersgrense, produsent, anmeldelse
    @ManyToOne
    @JoinColumn(name = "aldersgrense_id", nullable = false)
    private Aldersgrense aldersgrense;

    @ManyToOne
    @JoinColumn(name = "produsent_id", nullable = false)
    private Produsent produsent;

    @ManyToOne
    @JoinColumn(name = "anmeldelse_id")
    private Anmeldelse anmeldelse;

    @ManyToMany
    @JoinTable(
            name = "SpillTriggerWarnings",
            joinColumns = @JoinColumn(name = "trigger_warning_id"),
            inverseJoinColumns = @JoinColumn(name = "spill_id"))
    private Set<TriggerWarning> triggerwarnings = new HashSet<>;

    @ManyToMany (mappedBy = "spillplattformer")
    private Set<Plattform> plattformer;

    @ManyToMany (mappedBy = "spillsjangere")
    private Set<Spill> spillsjangere;
}
