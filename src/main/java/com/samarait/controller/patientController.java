package com.samarait.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samarait.model.Patient;
import com.samarait.service.patientServiceImpl;
import java.util.*;

@RestController
@RequestMapping("/patient")

public class patientController {
	
	private patientServiceImpl patientServices;
	
	public patientController(patientServiceImpl patientServices) {
		this.patientServices = patientServices;
	}

	@PostMapping
	public Patient createPatient(@RequestBody Patient patient) {
		
	Patient result = 	patientServices.createPatient(patient);
		
		return result;
	}
	
	@GetMapping("/{id}")
	public Optional<Patient> getPatient(@PathVariable Integer id) {
		
	Optional<Patient> result=	patientServices.getPatient(id);
	return result;
		
	}
	
	@GetMapping("/all")
	public List<Patient> getAllPatients() {
	List<Patient> patients = 	patientServices.getPatients();
		
	return patients;
	}
	
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable Integer id) {
		patientServices.deletePatient(id);
		
	}

}
