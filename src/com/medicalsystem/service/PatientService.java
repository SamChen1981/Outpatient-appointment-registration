package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TPatient;

public interface PatientService {
	
	public TPatient queryMyself(long id);
	
	public void updatePatient(TPatient patient);
	
	public void insertPatient(TPatient patient);
	
	public void deletePatient(long id); 
	
	public List<TPatient> findPatientList(TPatient patient);
}
