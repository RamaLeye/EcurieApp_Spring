package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.Role;
import com.spring.ecurieApp.repositories.RoleRepository;
import com.spring.ecurieApp.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role createRole(String nomRole) {

        Role role = new Role(nomRole);
        return roleRepository.save(role);
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role findByName(String nomRole) {
        return roleRepository.findByName(nomRole);
    }

    @Override
    public Role findById(int idRole) {
        return roleRepository.findOne((long)idRole);
    }

    @Override
    public void delete(Role Role) {

    }

    @Override
    public Optional<Role> findOne(int id) {
        return Optional.empty();
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role update(Role RoleToUpdate, String codeRole, String nomRole) {
        return null;
    }

}
