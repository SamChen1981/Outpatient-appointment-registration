package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TPatient;
/**
 * 
 * @Title:PatientService
 * @author hxiaope
 * @date 2016年11月15日上午11:18:51
 * @version 1.0
 */
public interface PatientService {
	
	public TPatient queryMyself(long id);
	
	public void updatePatient(TPatient patient);
	
	public void insertPatient(TPatient patient);
	
	public void deletePatient(long id); 
	
	public List<TPatient> findPatientList(TPatient patient);
	
	public List<TPatient> findIdlikeList(Long patientId);
	
}
