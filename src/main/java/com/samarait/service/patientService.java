package com.samarait.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samarait.model.Patient;

@Service
public interface patientService {
	
	
	Patient createPatient(Patient patient);
	Optional<Patient> getPatient(Integer id);
	List<Patient> getPatients();
	void deletePatient(Integer id);
	Patient updatePatient(Integer id, Patient patient);
	
	
	
}
