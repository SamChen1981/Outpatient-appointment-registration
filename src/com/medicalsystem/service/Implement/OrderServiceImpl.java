package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TOrderMapper;
import com.medicalsystem.pojo.TOrder;
import com.medicalsystem.service.OrderService;
/**
 * 
 * @Title:OrderServiceImpl
 * @author hxiaope
 * @date 2016年11月8日下午11:21:23
 * @version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private TOrderMapper orderMapper;
	
	@Override
	public List<TOrder> findOrder(long patientId) {

		return null;
	}

	@Override
	public void deleteOrder(long orderId) {
		orderMapper.deleteByPrimaryKey(orderId);
	}

}
