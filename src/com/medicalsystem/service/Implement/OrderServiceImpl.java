package com.medicalsystem.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalsystem.mapper.TBasicinfoMapper;
import com.medicalsystem.mapper.TOrderMapper;
import com.medicalsystem.pojo.TBasicinfo;
import com.medicalsystem.pojo.TBasicinfoExample;
import com.medicalsystem.pojo.TOrder;
import com.medicalsystem.service.OrderService;
/**
 * 
 * @Title:OrderServiceImpl
 * @author hxiaope
 * @date 2016年11月12日上午10:05:31
 * @version 1.0
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private TOrderMapper orderMapper;
	@Autowired
	private TBasicinfoMapper basicinfoMapper;
	
	@Override
	public void insertOrder(TOrder order) {
		orderMapper.insert(order);
	}

	@Override
	public void deleteOrder(long orderId) {
		orderMapper.deleteByPrimaryKey(orderId);
	}

	@Override
	public TOrder findOrder(Long orderId) {
		
		return orderMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public List<TBasicinfo> findBasicInfoList(Long baseId) {
		TBasicinfoExample example = new TBasicinfoExample();
		example.createCriteria().andBasicIdEqualTo(baseId);
		List<TBasicinfo> list = basicinfoMapper.selectByExampleWithBLOBs(example);
		
		return list;
	}
	
	

}
