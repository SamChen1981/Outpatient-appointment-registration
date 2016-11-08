package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TOrder;

/**
 * 
 * @Title:Order
 * @author hxiaope
 * @date 2016年11月8日下午11:12:16
 * @version 1.0
 */
public interface OrderService {
	
	public List<TOrder> findOrder(long patientId);
	
	public void deleteOrder(long orderId);
}
