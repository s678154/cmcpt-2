package com.CanMyChildPlayThis.demo.models;

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
            joinColumns = @JoinColumn(name = "spill_id"),
            inverseJoinColumns = @JoinColumn(name = "spill_trigger_warning_id"))
    private Set<TriggerWarning> triggerWarningSet = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "SpillPlatformer",
            joinColumns = @JoinColumn(name = "spill_id"),
            inverseJoinColumns = @JoinColumn(name = "plattform_id"))
    private Set<Plattform> plattformSet = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "SpillSjangere",
            joinColumns = @JoinColumn(name = "spill_id"),
            inverseJoinColumns = @JoinColumn(name = "sjanger_id"))
    private Set<Sjanger> sjangerSet = new HashSet<>();

    public Spill(String tittel, double pris, String storrelse, String beskrivelse, Date utgivelse, String bilde_url, Aldersgrense aldersgrense, Produsent produsent, Anmeldelse anmeldelse, Set<TriggerWarning> triggerWarningSet, Set<Plattform> plattformSet, Set<Sjanger> sjangerSet) {
        this.tittel = tittel;
        this.pris = pris;
        this.storrelse = storrelse;
        this.beskrivelse = beskrivelse;
        this.utgivelse = utgivelse;
        this.bilde_url = bilde_url;
        this.aldersgrense = aldersgrense;
        this.produsent = produsent;
        this.anmeldelse = anmeldelse;
        this.triggerWarningSet = triggerWarningSet;
        this.plattformSet = plattformSet;
        this.sjangerSet = sjangerSet;
    }
    public Spill() {}

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getStorrelse() {
        return storrelse;
    }

    public void setStorrelse(String storrelse) {
        this.storrelse = storrelse;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public Date getUtgivelse() {
        return utgivelse;
    }

    public void setUtgivelse(Date utgivelse) {
        this.utgivelse = utgivelse;
    }

    public String getBilde_url() {
        return bilde_url;
    }

    public void setBilde_url(String bilde_url) {
        this.bilde_url = bilde_url;
    }

    public Aldersgrense getAldersgrense() {
        return aldersgrense;
    }

    public void setAldersgrense(Aldersgrense aldersgrense) {
        this.aldersgrense = aldersgrense;
    }

    public Produsent getProdusent() {
        return produsent;
    }

    public void setProdusent(Produsent produsent) {
        this.produsent = produsent;
    }

    public Anmeldelse getAnmeldelse() {
        return anmeldelse;
    }

    public void setAnmeldelse(Anmeldelse anmeldelse) {
        this.anmeldelse = anmeldelse;
    }

    public Set<TriggerWarning> getTriggerWarningSet() {
        return triggerWarningSet;
    }

    public void setTriggerWarningSet(Set<TriggerWarning> triggerWarningSet) {
        this.triggerWarningSet = triggerWarningSet;
    }

    public Set<Plattform> getPlattformSet() {
        return plattformSet;
    }

    public void setPlattformSet(Set<Plattform> plattformSet) {
        this.plattformSet = plattformSet;
    }

    public Set<Sjanger> getSjangerSet() {
        return sjangerSet;
    }

    public void setSjangerSet(Set<Sjanger> sjangerSet) {
        this.sjangerSet = sjangerSet;
    }

    @Override
    public String toString() {
        return "Spill{" +
                "spill_id=" + spill_id +
                ", tittel='" + tittel + '\'' +
                ", pris=" + pris +
                ", storrelse='" + storrelse + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", utgivelse=" + utgivelse +
                ", bilde_url='" + bilde_url + '\'' +
                ", aldersgrense=" + aldersgrense +
                ", produsent=" + produsent +
                ", anmeldelse=" + anmeldelse +
                ", triggerWarningSet=" + triggerWarningSet +
                ", plattformSet=" + plattformSet +
                ", sjangerSet=" + sjangerSet +
                '}';
    }
}