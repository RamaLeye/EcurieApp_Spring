package com.spring.ecurieApp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FicheHorse {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    String race;

    @Column
    Date lastVaccination;

    @Column
    Date birthDate;

    @Column
    Double weight;

    @Column
    Boolean gender;

    @OneToOne//(mappedBy = "ficheHorse")
    Horse horse;

    public FicheHorse(String race, Date lastVaccination, Date birthDate, Double weight, Boolean gender, Horse horse) {
        this.race = race;
        this.lastVaccination = lastVaccination;
        this.birthDate = birthDate;
        this.weight = weight;
        this.gender = gender;
        this.horse = horse;
    }

    public FicheHorse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getLastVaccination() {
        return lastVaccination;
    }

    public void setLastVaccination(Date lastVaccination) {
        this.lastVaccination = lastVaccination;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }
}
