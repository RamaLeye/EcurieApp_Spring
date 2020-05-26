package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    List<Role> findAll();


    Role createRole( String nomRole);


    Role addRole(Role Role);



    Role findByName(String nomRole);


    Role findById(int idRole);


    void delete(Role Role);


    Optional<Role> findOne(int id);


    Role save(Role Role);


    Role update(Role RoleToUpdate, String codeRole, String nomRole);
}
