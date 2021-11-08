package com.soft.cabinet.repository;

import com.soft.cabinet.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Long> {
}
