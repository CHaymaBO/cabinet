package com.soft.cabinet.service;

import com.soft.cabinet.model.Doctor;
import com.soft.cabinet.model.Patient;
import com.soft.cabinet.repository.DoctorRepository;
import com.soft.cabinet.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImp implements DoctorService{
    @Autowired // Automatic write and read ( injection d'un objet)
    DoctorRepository agent;

    @Override
    public void saveorupdate(Doctor doctor) {
        agent.save(doctor);
    }

    @Override
    public Doctor getById(long iddoctor) {
        return agent.findById(iddoctor).get();
    }

    @Override
    public void delete(long iddoctor) {
        agent.deleteById(iddoctor);

    }

    @Override
    public List<Doctor> consulte() {
        return (List<Doctor>) agent.findAll();
    }
}
