package com.spring.ecurieApp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Horse extends Service {

    @Column
    String nom;

  //  @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name="fiche_horse_id", referencedColumnName = "id")
  //  @JsonIgnore
   // FicheHorse ficheHorse;

    public Horse() {
    }

    public Horse(List<Contrat> contracts, List<Date> disponibilities, String nom, FicheHorse ficheHorse) {
        super(contracts, disponibilities);
        this.nom = nom;
       // this.ficheHorse = ficheHorse;
    }

    public Horse(String nom, FicheHorse ficheHorse) {
        this.nom = nom;
       // this.ficheHorse = ficheHorse;
    }

    public Horse(String nom) {
        this.nom = nom;
       // this.ficheHorse = new FicheHorse();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

  /*  public FicheHorse getFicheHorse() {
        return ficheHorse;
    }*/

    public void setFicheHorse(FicheHorse ficheHorse) {
      //  this.ficheHorse = ficheHorse;
    }
}
