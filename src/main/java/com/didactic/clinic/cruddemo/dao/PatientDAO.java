package com.didactic.clinic.cruddemo.dao;

import java.util.List;

import com.didactic.clinic.cruddemo.entity.Patient;

public interface PatientDAO {

	public List<Patient> getPacients();
	
	public Patient getPacient(int id);
	
	public void save(Patient pacient);
	
	public void deleteById(int id);
	
	public void delete(Patient pacient);
}
