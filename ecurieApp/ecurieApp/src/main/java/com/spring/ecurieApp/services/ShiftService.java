package com.spring.ecurieApp.services;


import com.spring.ecurieApp.models.Shift;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ShiftService {

    List<Shift> findAll();


    Shift create(Shift shift);

    void update(Shift shiftToUpdate, Date debut, Date fin);


    void delete(Shift shift);



    Shift save(Shift shift);

}
