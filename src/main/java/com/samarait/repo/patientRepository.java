package com.samarait.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samarait.model.Patient;

public interface patientRepository extends JpaRepository<Patient, Integer>{

}
