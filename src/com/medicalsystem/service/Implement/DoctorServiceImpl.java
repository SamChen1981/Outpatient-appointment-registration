package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TDoctorMapper;
import com.medicalsystem.pojo.TDoctor;
import com.medicalsystem.pojo.TDoctorExample;
import com.medicalsystem.service.DoctorService;
/**
 * 
 * @Title:DoctorServiceImpl
 * @author hxiaope
 * @date 2016年11月13日下午10:38:43
 * @version 1.0
 */
@Service("DoctorService")
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private TDoctorMapper doctorMapper;
	@Override
	public List<TDoctor> findByDepartmentId(Long departmentId) {
		TDoctorExample example = new TDoctorExample();
		example.createCriteria().andDepartmentIdEqualTo(departmentId);
		List<TDoctor> list = doctorMapper.selectByExample(example);
		return list;
	}
	@Override
	public TDoctor findById(Long id) {
		return doctorMapper.selectByPrimaryKey(id);
	}

}
