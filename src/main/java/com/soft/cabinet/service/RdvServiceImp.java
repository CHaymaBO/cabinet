package com.soft.cabinet.service;

import com.soft.cabinet.model.Patient;
import com.soft.cabinet.model.Rdv;
import com.soft.cabinet.repository.PatientRepository;
import com.soft.cabinet.repository.RdvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RdvServiceImp implements RdvService  {
    @Autowired // Automatic write and read ( injection d'un objet)
    RdvRepository agent;

    @Override
    public void saveorupdate(Rdv rdv) {

        agent.save(rdv);
        // mail de confirmation
    }

    @Override
    public Rdv getById(long idrdv) {
        return agent.findById(idrdv).get();
    }

    @Override
    public void delete(long idrdv) {
        agent.deleteById(idrdv);
        // je dois l'archiver
    }

    @Override
    public List<Rdv> consulte() {
        return (List<Rdv>) agent.findAll();
    }

}
