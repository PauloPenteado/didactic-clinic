package com.didactic.clinic.cruddemo.service;

import java.util.List;

import com.didactic.clinic.cruddemo.entity.Patient;

public interface PatientService {

	public List<Patient> getPacients();
	
	public Patient getPacient(int id);
	
	public void save(Patient pacient);
	
	public void deleteById(int id);
	
}
