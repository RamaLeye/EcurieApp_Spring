package com.spring.ecurieApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employe extends User {

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "employe")
    private List<Shift> shifts;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "employe")
    private List<FichePaie> fichesPaie;

    public Employe(List<Shift> shifts, List<FichePaie> fichesPaie) {
        this.shifts = shifts;
        this.fichesPaie = fichesPaie;
    }

    public Employe(String first_name, String last_name, String username, String password, Role role, List<Shift> shifts, List<FichePaie> fichesPaie) {
        super(first_name, last_name, username, password, role);
        this.shifts = shifts;
        this.fichesPaie = fichesPaie;
    }

    public Employe(String first_name, String last_name, String username, String password, Role role) {
        super(first_name, last_name, username, password, role);
        shifts = new ArrayList<>();
        fichesPaie = new ArrayList<>();
    }

    public Employe() {
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public List<FichePaie> getFichesPaie() {
        return fichesPaie;
    }

    public void setFichesPaie(List<FichePaie> fichesPaie) {
        this.fichesPaie = fichesPaie;
    }

    public void addShift(Shift shift){
        shifts.add(shift);
    }

    public void addFichePaie(FichePaie fiche){
        fichesPaie.add(fiche);
    }
}
