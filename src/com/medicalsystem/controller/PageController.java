package com.medicalsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Title:PageController
 * @author hxiaope
 * @date 2016年10月24日下午4:06:43
 * @version 1.0
 */
@Controller
public class PageController {
	/**
	 * 打开首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "login";
	}
	
	/*
	 * 打开待处理预约页面
	 */
	@RequestMapping("/showDealWithOrder")
	public String showDealWithOrder(){
		return "dealOrder";
	}
	/**
	 * 打开挂号页面
	 * @return
	 */
	@RequestMapping("/showGuahao")
	public String showGuahao(){
		return "staffMain";
	}
}
