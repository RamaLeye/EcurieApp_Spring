package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.FichePaie;
import com.spring.ecurieApp.repositories.FichePaieRepository;
import com.spring.ecurieApp.services.FichePaieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FichePaieServiceImpl implements FichePaieService {

    @Autowired
    FichePaieRepository fichePaieRepository;

    @Override
    public List<FichePaie> findAll() {
        return fichePaieRepository.findAll();
    }

    @Override
    public FichePaie create(FichePaie fiche) {
        return save(fiche);
    }

    @Override
    public void update(FichePaie ficheToUpdate, Double salaire) {
        ficheToUpdate.setSalaire(salaire);
        save(ficheToUpdate);
    }

    @Override
    public void delete(FichePaie fiche) {
        fichePaieRepository.deleteById(fiche.getId());
    }

    @Override
    public FichePaie save(FichePaie fiche) {
        return fichePaieRepository.save(fiche);
    }




}
