package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.Adherent;

import java.util.List;

public interface AdherentService {

    List<Adherent> findAll();


    Adherent create(Adherent adherent);


    void delete(Adherent adherent);



    Adherent save(Adherent adherent);
}
