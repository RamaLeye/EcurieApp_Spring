package com.spring.ecurieApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Service {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "service")
    List<Contrat> contracts;

    @ElementCollection
    @CollectionTable(name = "disponibilities", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "disponibilities")
    List<Date> disponibilities;

    void rent(Date date){
        if(!disponibilities.contains(date)){
            disponibilities.add(date);
        }
    }

    public Service(List<Contrat> contracts, List<Date> disponibilities) {
        this.contracts = contracts;
        this.disponibilities = disponibilities;
    }

    public Service() {
        contracts = new ArrayList<>();
        disponibilities = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Contrat> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contrat> contracts) {
        this.contracts = contracts;
    }

    public List<Date> getDisponibilities() {
        return disponibilities;
    }

    public void setDisponibilities(List<Date> disponibilities) {
        this.disponibilities = disponibilities;
    }
}
