package com.spring.ecurieApp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FichePaie {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    Employe employe;

    @Column
    Date date;

    @Column
    Double salaire;

    public FichePaie() {

    }

    public FichePaie(Employe employe, Date date, Double salaire) {
        this.employe = employe;
        this.date = date;
        this.salaire = salaire;
        employe.addFichePaie(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
}
