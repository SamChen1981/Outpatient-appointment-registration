package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TDoctor;

/**
 * 
 * @Title:DoctorService
 * @author hxiaope
 * @date 2016年11月13日下午10:33:01
 * @version 1.0
 */
public interface DoctorService {
	public List<TDoctor> findByDepartmentId(Long id);
	
	public  TDoctor findById(Long id);
}
