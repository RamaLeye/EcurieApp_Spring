package com.spring.ecurieApp.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Adherent extends User {

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "adherent")
    private List<Contrat> contrats;

    public Adherent(List<Contrat> contrats) {
        this.contrats = contrats;
    }

    public Adherent(User u, List<Contrat> contrats) {
        super(u);
        this.contrats = contrats;
    }

    public Adherent(String first_name, String last_name, String username, String password, Role role, List<Contrat> contrats) {
        super(first_name, last_name, username, password, role);
        this.contrats = contrats;
    }

    public List<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }
}
