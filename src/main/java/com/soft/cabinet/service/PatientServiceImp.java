package com.soft.cabinet.service;

import com.soft.cabinet.model.Patient;
import com.soft.cabinet.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImp implements PatientService{


    @Autowired // Automatic write and read ( injection d'un objet)
    PatientRepository agent;

    @Override
    public void saveorupdate(Patient patient) {

        agent.save(patient);
        // mail de confirmation
    }

    @Override
    public Patient getById(long idpatient) {

        return agent.findById(idpatient).get();
    }

    @Override
    public void delete(long idpatient) {
        agent.deleteById(idpatient);
        // je dois l'archiver
    }

    @Override
    public List<Patient> consulte() {

        return (List<Patient>) agent.findAll();
    }

}
