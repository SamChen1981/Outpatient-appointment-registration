package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TSchedulCustomMapper;
import com.medicalsystem.pojo.TSchedulCustom;
import com.medicalsystem.service.SchedulCustomService;
/**
 * 
 * @Title:SchedulCustomImpl
 * @author hxiaope
 * @date 2016年11月13日下午8:45:37
 * @version 1.0
 */
@Service("SchedulCustomService")
public class SchedulCustomServiceImpl implements SchedulCustomService {
	
	@Autowired 
	private TSchedulCustomMapper schedulCustomMapper;
	
	@Override
	public List<TSchedulCustom> findSchedul(Long departmentId) {
		return schedulCustomMapper.findSchedulList(departmentId);
	}

}
