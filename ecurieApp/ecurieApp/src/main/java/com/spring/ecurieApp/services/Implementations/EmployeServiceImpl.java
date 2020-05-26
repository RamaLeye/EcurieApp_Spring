package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.Employe;
import com.spring.ecurieApp.repositories.EmployeRepository;
import com.spring.ecurieApp.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepository employeRepository;


    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe create(Employe employe) {
        return save(employe);
    }

    @Override
    public void delete(Employe employe) {
        employeRepository.deleteById(employe.getId());
    }

    @Override
    public Employe save(Employe employe) {
        return employeRepository.save(employe);
    }
}
