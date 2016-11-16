package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TGuahaoMapper;
import com.medicalsystem.pojo.TGuahao;
import com.medicalsystem.pojo.TGuahaoExample;
import com.medicalsystem.service.GuahaoService;
/**
 * 
 * @Title:GuahaoServiceImpl
 * @author hxiaope
 * @date 2016年11月16日上午10:09:29
 * @version 1.0
 */
@Service("GuahaoService")
public class GuahaoServiceImpl implements GuahaoService {

	@Autowired
	private TGuahaoMapper guahaoMapper;
	
	@Override
	public void insertGuahao(TGuahao guahao) {
		guahaoMapper.insert(guahao);
	}

	@Override
	public void deleteGuahao(Long id) {
		guahaoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<TGuahao> findGuahaoList(TGuahao guahao) {
		return null;
	}

	@Override
	public TGuahao findByGuahaoId(Long id) {
		return guahaoMapper.selectByPrimaryKey(id);
	}

}
