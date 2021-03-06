package com.didactic.clinic.cruddemo.dao;

import java.util.List;

import com.didactic.clinic.cruddemo.entity.Patient;

public interface PatientDAO {

	public List<Patient> getPatients();
	
	public Patient getPatient(int id);
	
	public void save(Patient patient);
	
	public void deleteById(int id);
	
	public void delete(Patient patient);
}
