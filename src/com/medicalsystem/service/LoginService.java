package com.medicalsystem.service;

import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.pojo.TStaff;

/**
 * 
 * @Title:LoginService
 * @author hxiaope
 * @date 2016年11月8日下午4:57:04
 * @version 1.0
 */
public interface LoginService {
	public TPatient findPatient(long patientId);
	
	public TStaff findStaff(long staffId);
}
