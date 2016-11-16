package com.medicalsystem.service;

import java.util.List;

import com.medicalsystem.pojo.TBasicinfo;
import com.medicalsystem.pojo.TOrder;

/**
 * 
 * @Title:OrderService
 * @author hxiaope
 * @date 2016年11月12日上午10:03:32
 * @version 1.0
 */
public interface OrderService {
	public void insertOrder(TOrder order);
	
	public void deleteOrder(long orderId);
	
	public TOrder findOrder(Long orderId);
	
	public List<TBasicinfo> findBasicInfoList(Long baseId);
}
