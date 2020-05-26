package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.Employe;
import com.spring.ecurieApp.models.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ShiftRepository extends JpaRepository<Shift, Long > {

    @Query("select s from Shift s where s.id = ?1")
    Shift findOne(long ID);


}