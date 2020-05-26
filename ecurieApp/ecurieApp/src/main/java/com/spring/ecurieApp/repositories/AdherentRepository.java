package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdherentRepository extends JpaRepository<Adherent, Long > {

    @Query("select a from Adherent a where a.id = ?1")
    Adherent findOne(long ID);


}