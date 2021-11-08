package com.soft.cabinet.service;

import com.soft.cabinet.model.Patient;
import java.util.List;

public interface PatientService {

    public void saveorupdate(Patient patient);
    public Patient getById(long idpatient);
    public void delete(long idpatient);
    public List<Patient> consulte();
}
