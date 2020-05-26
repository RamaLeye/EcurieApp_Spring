package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.Horse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HorseRepository extends JpaRepository<Horse, Long > {

    @Query("select h from Horse h where h.id = ?1")
    Horse findOne(long ID);


}