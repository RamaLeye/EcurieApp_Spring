package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long > {

    @Query("select r from Role r where r.id = ?1")
    Role findOne(long ID);

   // @Query("select role from role Role where role.role_name = ?1")
    Role findByName(String s);
}
