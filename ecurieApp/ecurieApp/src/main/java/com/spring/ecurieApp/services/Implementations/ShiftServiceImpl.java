package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.Shift;
import com.spring.ecurieApp.repositories.ShiftRepository;
import com.spring.ecurieApp.services.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ShiftServiceImpl implements ShiftService {

    @Autowired
    ShiftRepository shiftRepository;

    @Override
    public List<Shift> findAll() {
        return shiftRepository.findAll();
    }

    @Override
    public Shift create(Shift shift) {
        return save(shift);
    }

    @Override
    public void update(Shift shiftToUpdate, Date debut, Date fin) {
        shiftToUpdate.setDebut(debut);
        shiftToUpdate.setFin(fin);
        save(shiftToUpdate);
    }

    @Override
    public void delete(Shift shift) {
        shiftRepository.deleteById(shift.getId());
    }

    @Override
    public Shift save(Shift shift) {
        return shiftRepository.save(shift);
    }
}
