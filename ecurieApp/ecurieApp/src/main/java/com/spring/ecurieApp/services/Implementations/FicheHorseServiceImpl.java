package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.FicheHorse;
import com.spring.ecurieApp.repositories.FicheHorseRepository;
import com.spring.ecurieApp.repositories.FichePaieRepository;
import com.spring.ecurieApp.services.FicheHorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.ignoreCase;

@Component
public class FicheHorseServiceImpl implements FicheHorseService {

    @Autowired
    FicheHorseRepository ficheHorseRepository;

    @Override
    public List<FicheHorse> findAll() {
        return ficheHorseRepository.findAll();
    }

    @Override
    public FicheHorse create(FicheHorse ficheHorse) {

        ExampleMatcher modelMatcher = ExampleMatcher.matching()
                .withIgnorePaths("id")
                .withMatcher("model", ignoreCase());
        Example<FicheHorse> example = Example.of(ficheHorse,modelMatcher);
        if(!ficheHorseRepository.exists(example)){
            return save(ficheHorse);
        }
        else return null;
    }

    @Override
    public void delete(FicheHorse ficheHorse) {
        ficheHorseRepository.deleteById(ficheHorse.getId());
    }

    @Override
    public FicheHorse save(FicheHorse ficheHorse) {
        return ficheHorseRepository.save(ficheHorse);
    }
}
