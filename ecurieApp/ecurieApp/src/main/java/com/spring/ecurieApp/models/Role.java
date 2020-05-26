package com.spring.ecurieApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue
    Long id;

    @Column
    String name;

    public Role() {
    }

    public Role(String role_name) {
        this.name = role_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole_name() {
        return name;
    }

    public void setRole_name(String role_name) {
        this.name = role_name;
    }
}
