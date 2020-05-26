package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.Employe;
import com.spring.ecurieApp.models.FichePaie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FichePaieRepository extends JpaRepository<FichePaie, Long > {

    @Query("select f from FichePaie f where f.id = ?1")
    FichePaie findOne(long ID);


}