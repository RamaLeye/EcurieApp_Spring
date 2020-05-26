package com.spring.ecurieApp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Shift {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    Employe employe;

    @Column
    Date debut;

    @Column
    Date fin;


    public Shift() {
    }

    public Shift(Employe employe, Date debut, Date fin) {
        this.employe = employe;
        this.debut = debut;
        this.fin = fin;
        employe.addShift(this);
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

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
}
