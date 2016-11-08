package com.medicalsystem.service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TPatientMapper;
import com.medicalsystem.mapper.TStaffMapper;
import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.pojo.TStaff;
import com.medicalsystem.service.LoginService;
/**
 * 
 * @Title:LoginServiceImpl
 * @author hxiaope
 * @date 2016年11月8日下午5:00:48
 * @version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private TStaffMapper staffMapper;
	@Autowired
	private TPatientMapper patientMapper;
	
	@Override
	public TPatient findPatient(long patientId) {
		return patientMapper.selectByPrimaryKey(patientId);
	}

	@Override
	public TStaff findStaff(long staffId) {
		return staffMapper.selectByPrimaryKey(staffId);
	}

}
