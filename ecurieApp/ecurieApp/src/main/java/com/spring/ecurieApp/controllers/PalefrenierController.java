package com.spring.ecurieApp.controllers;

import com.spring.ecurieApp.models.*;
import com.spring.ecurieApp.services.FicheHorseService;
import com.spring.ecurieApp.services.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/palefrenier")
public class PalefrenierController {

    @Autowired
    private HorseService horseService;
    @Autowired
    private FicheHorseService ficheHorseService;
    @RequestMapping(value="/horses", method = RequestMethod.GET)
    public String horses( Model model){

        model.addAttribute("horses", horseService.findAll());
        return "/palefrenier/horses";
    }

    @RequestMapping(value="/indexPalefrenier", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model){

        User user = (User) request.getSession().getAttribute("connectedUser");
        model.addAttribute("horses", horseService.findAll());
        model.addAttribute("connectedUser", user);
        return "/palefrenier/indexPalefrenier";
    }

//( @RequestParam MultiValueMap<String, String> params)
    @RequestMapping(value="/addHorse", method = RequestMethod.POST)
    public String addHorse(RedirectAttributes rm, Model model, @RequestParam("name") String nom, @RequestParam("race") String race, @RequestParam("birthDate") String birthDate, @RequestParam("gender") String gender,
                           @RequestParam("weight") String poids, @RequestParam("vaccinationDate") String vaccination) throws ParseException {

       // JsonResponse response = new JsonResponse();

        //System.out.println();
        SimpleDateFormat formatterDateTime = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = formatterDateTime.parse(birthDate);
        Date vaccin = formatterDateTime.parse(vaccination);
        Double weight = Double.parseDouble(poids);

        Horse horse = new Horse(nom);

        //true si femme , false si male
        Boolean sex = gender.equals("female")?true:false;

        FicheHorse fiche = new FicheHorse(race,vaccin, birth,weight, sex, horse);
        horse.setFicheHorse(fiche);
        horseService.create(horse);
        ficheHorseService.create(fiche);

        model.addAttribute("ajout","La fiche a bien été ajoutée.");
        rm.addFlashAttribute("ajout","La fiche a bien été ajoutée.");
        return "redirect:/palefrenier/horses";
    }



}
