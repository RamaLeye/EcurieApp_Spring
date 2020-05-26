package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.FichePaie;

import java.util.Date;
import java.util.List;

public interface FichePaieService {
    List<FichePaie> findAll();


    FichePaie create(FichePaie fiche);

    void update(FichePaie ficheToUpdate, Double salaire);


    void delete(FichePaie fiche);


    FichePaie save(FichePaie fiche);
}
