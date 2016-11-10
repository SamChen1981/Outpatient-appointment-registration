package com.medicalsystem.mapper;

import java.util.List;

import com.medicalsystem.pojo.TOrderCustom;

/**
 * 
 * @Title:TOrderCustomMapper
 * @author hxiaope
 * @date 2016年11月9日下午6:34:13
 * @version 1.0
 */
public interface TOrderCustomMapper {
	public List<TOrderCustom> findOrderCustom(long patientId);
}