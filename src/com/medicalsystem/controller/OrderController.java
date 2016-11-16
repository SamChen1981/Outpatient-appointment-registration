package com.medicalsystem.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalsystem.mapper.TDepartmentMapper;
import com.medicalsystem.pojo.TDepartment;
import com.medicalsystem.pojo.TDoctor;
import com.medicalsystem.pojo.TOrder;
import com.medicalsystem.pojo.TOrderCustom;
import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.service.DoctorService;
import com.medicalsystem.service.OrderCustomService;
import com.medicalsystem.service.OrderService;
import com.medicalsystem.service.PatientService;

/**
 * 
 * @Title:OrderController
 * @author hxiaope
 * @date 2016年11月11日上午12:28:33
 * @version 1.0
 */
@Controller
@RequestMapping(method={RequestMethod.GET,RequestMethod.POST})
public class OrderController {

	@Autowired
	private OrderCustomService orderCustomService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private PatientService patientService;
	@Autowired
	private DoctorService DoctorService;
	@Autowired
	private TDepartmentMapper departmentMapper;
	
	@RequestMapping("/queryOrderList")
	public String queryOrderList(Model model,HttpSession session){
		Long patientId = (Long) session.getAttribute("patientId");
		List<TOrderCustom> list = orderCustomService.findOrder(patientId);
		model.addAttribute("orderList", list);
		return "queryOrder";
	}
	/*
	 * 展示预约
	 */
	@RequestMapping("/showApplyOrder")
	public String showApplyOrder(Model model){
		List<TDepartment> departmentList = departmentMapper.selectAll();
		model.addAttribute("departmentList", departmentList);
		return "applyOrder";
	}
	
	@RequestMapping("/submitOrder")
	public String submitOrder(TOrder order,HttpSession session,Model model){
		orderService.insertOrder(order);
		String paName=(String) session.getAttribute("patientName");
		TPatient patient= new TPatient();
		patient.setPatientName(paName);
		List<TPatient> list = patientService.findPatientList(patient);
		if(list!=null&&list.size()>0){
			model.addAttribute("patient", list.get(0));
		}
		return "patientMain";
	}
	
	@RequestMapping("/deleteOrder")
	@ResponseBody
	public void deleteOrder(Long orderId){
		orderService.deleteOrder(orderId);
	}
	
	@RequestMapping("/returnPa")
	public String returnPa() {
		return "forward:patientMainCon";
	}
	
//	@RequestMapping("/getDoctor")
//	@ResponseBody
//	public List<TDoctor> getDoctor(Long departmentId){
//		List<TDoctor> list = DoctorService.findByDepartmentId(departmentId);
//		return list;
//	}
//	
	@RequestMapping("/addOrder")
	@ResponseBody
	public String addOrderSubmit(Long departmentId,Long costId,String ordertime,HttpSession session,Long doctorId) throws Exception{
		Long patientId= (Long) session.getAttribute("patientId");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(ordertime);
		TOrder order = new TOrder();
		order.setCostId(costId);
		order.setDepartmentId(departmentId);
		order.setPatientId(patientId);
		order.setOrdertime(d);
		order.setDoctorId(doctorId);
		orderService.insertOrder(order);
		return "1";
	}
	
	//挂号响应ajax请求
	@RequestMapping("/findDoctor")
	@ResponseBody
	public TDoctor findDoctorById(Long doctorId){
		TDoctor doctor = DoctorService.findById(doctorId);
		return doctor;
	}
}
