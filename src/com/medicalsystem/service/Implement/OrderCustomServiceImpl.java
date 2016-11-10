package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TOrderCustomMapper;
import com.medicalsystem.pojo.TOrderCustom;
import com.medicalsystem.service.OrderCustomService;
/**
 * 
 * @Title:OrderServiceImpl
 * @author hxiaope
 * @date 2016年11月8日下午11:21:23
 * @version 1.0
 */
@Service("OrderCustomService")
public class OrderCustomServiceImpl implements OrderCustomService {

	@Autowired
	private TOrderCustomMapper orderCustomMapper;
	
	@Override
	public List<TOrderCustom> findOrder(long patientId) {

		return orderCustomMapper.findOrderCustom(patientId);
	}

	@Override
	public void deleteOrder(long orderId) {

	}

}
