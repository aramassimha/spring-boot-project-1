package com.samarait.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samarait.model.Patient;
import com.samarait.repo.patientRepository;

@Service
public class patientServiceImpl implements patientService{
	
	private patientRepository repoPatient;
	
	public patientServiceImpl(patientRepository repoPatient) {
		this.repoPatient = repoPatient;
		
	}

	@Override
	public Patient createPatient(Patient patient) {
		
	Patient result = 	repoPatient.save(patient);
		return result;
	}

	@Override
	public Optional<Patient> getPatient(Integer id) {
		Optional<Patient> patient = repoPatient.findById(id);
		return patient;
	}

	@Override
	public List<Patient> getPatients() {
		List<Patient> listOfPatients = repoPatient.findAll();
		return listOfPatients;
	}

	@Override
	public void deletePatient(Integer id) {
		repoPatient.deleteById(id);
		
	}

	@Override
	public Patient updatePatient(Integer id, Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}



}
