package com.medicalsystem.service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TPatientMapper;
import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.service.PatientService;
/**
 * 
 * @Title:PatientServiceImpl
 * @author hxiaope
 * @date 2016年11月8日下午4:54:07
 * @version 1.0
 */
@Service
public class PatientServiceImpl implements PatientService {

	
	@Autowired
	private TPatientMapper patientMapper;
	
	@Override
	public TPatient queryMyself(long id) {
		return patientMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updatePatient(TPatient patient) {
		patientMapper.updateByPrimaryKey(patient);
	}

	@Override
	public void insertPatient(TPatient patient) {
		patientMapper.insert(patient);
	}

	@Override
	public void deletePatient(long id) {
		patientMapper.deleteByPrimaryKey(id);
	}
	

}
