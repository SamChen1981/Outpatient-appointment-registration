package com.medicalsystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.medicalsystem.pojo.TGuahaoCustom;

/**
 * 
 * @Title:TGuahaoCustomMapper
 * @author hxiaope
 * @date 2016年11月18日下午6:43:09
 * @version 1.0
 */
public interface TGuahaoCustomMapper {
	
	public List<TGuahaoCustom> findGuahaoCustomList(@Param("patientId")Long patientId);
}
