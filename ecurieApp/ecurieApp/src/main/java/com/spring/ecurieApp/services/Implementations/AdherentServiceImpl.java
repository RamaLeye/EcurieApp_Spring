package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.Adherent;
import com.spring.ecurieApp.repositories.AdherentRepository;
import com.spring.ecurieApp.services.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdherentServiceImpl implements AdherentService {

    @Autowired
    AdherentRepository adherentRepository;


    @Override
    public List<Adherent> findAll() {
        return adherentRepository.findAll();
    }

    @Override
    public Adherent create(Adherent adherent) {
        return save(adherent);
    }

    @Override
    public void delete(Adherent adherent) {
        adherentRepository.deleteById(adherent.getId());
    }

    @Override
    public Adherent save(Adherent adherent) {
        return adherentRepository.save(adherent);
    }


}
