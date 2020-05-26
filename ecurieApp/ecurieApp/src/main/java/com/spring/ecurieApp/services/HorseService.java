package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.Horse;

import java.util.List;

public interface HorseService {
    
    List<Horse> findAll();


    Horse create(Horse horse);


    void delete(Horse horse);



    Horse save(Horse horse);
}
