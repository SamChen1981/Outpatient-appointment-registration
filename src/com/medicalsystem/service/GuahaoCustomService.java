package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TGuahaoCustom;

/**
 * 
 * @Title:GuahaoCustomService
 * @author hxiaope
 * @date 2016年11月20日上午8:59:43
 * @version 1.0
 */
public interface GuahaoCustomService {
	
	public List<TGuahaoCustom> findGuahaoByPid(Long patientId);
}
