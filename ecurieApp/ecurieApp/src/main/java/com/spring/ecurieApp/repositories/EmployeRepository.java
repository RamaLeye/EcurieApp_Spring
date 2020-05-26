package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeRepository extends JpaRepository<Employe, Long > {

        @Query("select e from Employe e where e.id = ?1")
        Employe findOne(long ID);
}