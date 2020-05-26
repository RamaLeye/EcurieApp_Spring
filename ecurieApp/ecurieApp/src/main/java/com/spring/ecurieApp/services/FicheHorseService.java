package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.FicheHorse;

import java.util.List;

public interface FicheHorseService {
    
    List<FicheHorse> findAll();


    FicheHorse create(FicheHorse ficheHorse);


    void delete(FicheHorse ficheHorse);


    FicheHorse save(FicheHorse ficheHorse);
}