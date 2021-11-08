package com.soft.cabinet.repository;

import com.soft.cabinet.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Long>  {
}
