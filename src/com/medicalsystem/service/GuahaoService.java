package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TGuahao;

/**
 * 
 * @Title:GuahaoService
 * @author hxiaope
 * @date 2016年11月16日上午10:06:21
 * @version 1.0
 */
public interface GuahaoService {
	public void insertGuahao(TGuahao guahao);
	
	public void deleteGuahao(Long id);
	
	public List<TGuahao> findGuahaoList(TGuahao guahao);
	
	public TGuahao findByGuahaoId(Long id);
}
