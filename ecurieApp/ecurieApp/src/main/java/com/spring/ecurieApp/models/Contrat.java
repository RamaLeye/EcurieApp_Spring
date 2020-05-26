package com.spring.ecurieApp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contrat {
    @Id
    @GeneratedValue
    Long id;

    @Column
    Double sommeMensulle;

    @Column
    Boolean etatRenouvellement;

    @Column
    Date date;

    @ManyToOne
    @JoinColumn(nullable = true)
    Service service;

    @ManyToOne
    Adherent adherent;



}
