package com.soft.cabinet.service;

import com.soft.cabinet.model.Doctor;

import java.util.List;

public interface DoctorService {
    public void saveorupdate(Doctor doctor);
    public Doctor getById(long iddoctor);
    public void delete(long iddoctor);
    public List<Doctor> consulte();
}
