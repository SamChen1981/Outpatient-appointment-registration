package com.medicalsystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.medicalsystem.pojo.TSchedulCustom;

/**
 * 
 * @Title:TSchedulCustom
 * @author hxiaope
 * @date 2016年11月13日下午8:31:34
 * @version 1.0
 */
public interface TSchedulCustomMapper {
	public List<TSchedulCustom> findSchedulList(@Param("departmentId")Long departmentId);
}
