package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.FicheHorse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FicheHorseRepository extends JpaRepository<FicheHorse, Long > {

    @Query("select f from FicheHorse f where f.id = ?1")
    FicheHorse findOne(long ID);

}