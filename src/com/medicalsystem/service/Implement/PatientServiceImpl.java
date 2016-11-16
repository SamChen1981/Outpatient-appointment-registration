package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TPatientMapper;
import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.pojo.TPatientExample;
import com.medicalsystem.service.PatientService;
/**
 * 
 * @Title:PatientServiceImpl
 * @author hxiaope
 * @date 2016年11月8日下午4:54:07
 * @version 1.0
 */
@Service("PatientService")
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

	@Override
	public List<TPatient> findPatientList(TPatient patient) {
		TPatientExample example = new TPatientExample();
		example.createCriteria().andPatientNameEqualTo(patient.getPatientName());
		List<TPatient> list = patientMapper.selectByExample(example);		
		return list;
	}
/**
 * 根据主键模糊查询
 */
	@Override
	public List<TPatient> findIdlikeList(Long patientId) {
		List<TPatient> list = patientMapper.findIdlikeList(patientId);
		return list;
	}

	
}
