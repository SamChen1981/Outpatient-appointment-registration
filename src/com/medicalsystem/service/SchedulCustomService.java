package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TSchedulCustom;

/**
 * 
 * @Title:SchedulCustom
 * @author hxiaope
 * @date 2016年11月13日下午8:44:08
 * @version 1.0
 */
public interface SchedulCustomService {
	public List<TSchedulCustom> findSchedul(Long departmentId);
}
