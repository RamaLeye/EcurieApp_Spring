package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.Horse;
import com.spring.ecurieApp.repositories.HorseRepository;
import com.spring.ecurieApp.services.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HorseServiceImpl implements HorseService {

    @Autowired
    HorseRepository horseRepository;
    

    @Override
    public List<Horse> findAll() {
        return horseRepository.findAll();
    }

    @Override
    public Horse create(Horse horse) {
        return save(horse);
    }

    @Override
    public void delete(Horse horse) {
        horseRepository.deleteById(horse.getId());
    }

    @Override
    public Horse save(Horse horse) {
        return horseRepository.save(horse);
    }
}
