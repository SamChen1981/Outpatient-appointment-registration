package com.medicalsystem.service.Implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TBasicinfoMapper;
import com.medicalsystem.pojo.TBasicinfo;
import com.medicalsystem.service.BasicInfoService;
/**
 * 
 * @Title:BasicInfoServiceImpl
 * @author hxiaope
 * @date 2016年11月20日下午3:54:50
 * @version 1.0
 */
@Service("BasicInfoService")
public class BasicInfoServiceImpl implements BasicInfoService {

	@Autowired
	private TBasicinfoMapper basicinfoMapper;
	@Override
	public List<TBasicinfo> findAllInfo() {
		List<TBasicinfo> list = basicinfoMapper.selectAllInfo();
		return list;
	}
	@Override
	public TBasicinfo findById(long id) {
		return basicinfoMapper.selectByPrimaryKey(id);
	}
	@Override
	public void deleteById(Long id) {
		basicinfoMapper.deleteByPrimaryKey(id);
	}
	@Override
	public void insertInfo(TBasicinfo basicinfo) {
		basicinfoMapper.insert(basicinfo);
	}

}
