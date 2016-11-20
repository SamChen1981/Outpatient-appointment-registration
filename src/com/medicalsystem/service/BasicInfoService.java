package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TBasicinfo;
/**
 * 
 * @Title:BasicInfoService
 * @author hxiaope
 * @date 2016年11月20日下午3:53:42
 * @version 1.0
 */
public interface BasicInfoService {
	
	public List<TBasicinfo> findAllInfo();
	
	public TBasicinfo findById(long id);
	
	public void deleteById(Long id);
	
	public void insertInfo(TBasicinfo basicinfo);
}
