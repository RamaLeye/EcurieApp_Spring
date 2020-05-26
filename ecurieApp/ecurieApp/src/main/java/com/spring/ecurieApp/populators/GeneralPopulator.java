package com.spring.ecurieApp.populators;

import com.spring.ecurieApp.models.*;
import com.spring.ecurieApp.repositories.HorseRepository;
import com.spring.ecurieApp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class GeneralPopulator {

    @Autowired
    private RoleService roleService;
    @Autowired
    private ShiftService shiftService;
    @Autowired
    private FichePaieService fichePaieService;
    @Autowired
    private EmployeService employeService;
    @Autowired
    private HorseService horseService;
    @Autowired
    private FicheHorseService ficheHorseService;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder()  ;



    @PostConstruct
    void init()
    {
        //Roles
        roleService.createRole("ADMIN");
        roleService.createRole("PALEFRENIER");
        roleService.createRole("SECRETARY");
        roleService.createRole("ADHERENT");

       //Employes
        Employe palefrenier = new Employe("Claude", "Larousse", "clau.larousse" , encoder.encode("password"), roleService.findByName("PALEFRENIER"));
        Employe secretary = new Employe("Rama", "Leye", "rleye" , encoder.encode("password"), roleService.findByName("SECRETARY"));
        employeService.create(palefrenier);
        employeService.create(secretary);


        //shifts
        Date debut = new Date();
        Date fin = new Date();
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        format.format(debut);
        format.format(fin);


        Shift shiftPalefrenier = new Shift(palefrenier,debut,fin);
        Shift shiftSecretary = new Shift(secretary,debut,fin);
        shiftService.create(shiftPalefrenier);
        shiftService.create(shiftSecretary);

        //fiches de paie
        FichePaie fichePalefrenier = new FichePaie(palefrenier, debut, 2500.23);
        FichePaie ficheSecretary = new FichePaie(secretary, debut, 2500.25);
        fichePaieService.create(fichePalefrenier);
        fichePaieService.create(ficheSecretary);

        //Horses
        Horse horse1 = new Horse("Cheval_1");
        Horse horse2 = new Horse("Cheval_2");

        //Fiches Horses

        FicheHorse ficheHorse1 = new FicheHorse( "race1", debut, fin, 120.1, true, horse1);
        FicheHorse ficheHorse2 = new FicheHorse( "race2", debut, fin, 127.1, true, horse2);
        horse1.setFicheHorse(ficheHorse1);
        horse2.setFicheHorse(ficheHorse2);

        horseService.create(horse1);
        horseService.create(horse2);
        ficheHorseService.create(ficheHorse1);
        ficheHorseService.create(ficheHorse2);


    }
}
