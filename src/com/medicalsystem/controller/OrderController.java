package com.medicalsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalsystem.pojo.TOrderCustom;
import com.medicalsystem.service.OrderCustomService;

/**
 * 
 * @Title:OrderController
 * @author hxiaope
 * @date 2016年11月11日上午12:28:33
 * @version 1.0
 */
@Controller
public class OrderController {

	@Autowired
	private OrderCustomService orderCustomService;
	
	@RequestMapping("/queryOrder")
	public String queryOrderList(Long id,Model model){
		
		List<TOrderCustom> list = orderCustomService.findOrder(id);
		model.addAttribute("orderList", list);
		return "queryOrder";
	}
}
