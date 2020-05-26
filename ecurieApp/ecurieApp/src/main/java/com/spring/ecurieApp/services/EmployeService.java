package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.Employe;

import java.util.List;

public interface EmployeService {

    List<Employe> findAll();


    Employe create(Employe employe);


    void delete(Employe employe);



    Employe save(Employe employe);
}
