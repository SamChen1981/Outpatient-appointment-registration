package com.medicalsystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.medicalsystem.pojo.TOrderCustom;
import com.medicalsystem.pojo.TOrderCustomVo;

/**
 * 
 * @Title:TOrderCustomMapper
 * @author hxiaope
 * @date 2016年11月9日下午6:34:13
 * @version 1.0
 */
public interface TOrderCustomMapper {
	public List<TOrderCustom> findOrderCustom(long patientId);
	
	public List<TOrderCustomVo> findOrderByPatientId(@Param("patientId")Long patientId);
}