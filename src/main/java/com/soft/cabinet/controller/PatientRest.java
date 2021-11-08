package com.soft.cabinet.controller;

import com.soft.cabinet.model.Patient;
import com.soft.cabinet.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PatientRest {
    @Autowired //injecter le service dans le controller
    PatientService agent;  //agent = new PatientServiceImp(); ce n'est pas un objet permanant

    @RequestMapping(value = "/patients/add",method = RequestMethod.GET)
    public ModelAndView form_add_patient(){
        ModelAndView model = new ModelAndView();
        Patient patient = new Patient();
        model.addObject("FormPatient",patient);
        model.setViewName("add_patient");
        return model;
    }

    @RequestMapping(value = "/patients/save",method = RequestMethod.POST)
    public ModelAndView savePatient(@ModelAttribute("FormPatient") Patient patient){
       agent.saveorupdate(patient);

        return new ModelAndView("redirect:/");

    }

    @RequestMapping(value = "/patients/list",method = RequestMethod.GET)
    public ModelAndView list_patient(){
        List<Patient> patients=agent.consulte();
        ModelAndView model = new ModelAndView();
        model.addObject("patients",patients);
        model.setViewName("aff_patient");
        return model;
    }

    @RequestMapping(value = "/patients/delete/{id}",method = RequestMethod.GET)
    public ModelAndView supprimer_patient(@PathVariable("id") long id){
     agent.delete(id);
        return new ModelAndView("redirect:/patients/list");
    }

}
