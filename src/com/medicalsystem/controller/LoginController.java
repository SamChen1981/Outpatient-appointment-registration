package com.medicalsystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.pojo.TStaff;
import com.medicalsystem.service.LoginService;
import com.medicalsystem.service.PatientService;

/**
 * 
 * @Title:LoginController
 * @author hxiaope
 * @date 2016年11月8日下午5:08:59
 * @version 1.0
 */
@Controller
@RequestMapping(method={RequestMethod.POST,RequestMethod.GET})
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/login")
	public String longin(){
		return "login";
	}
	
	@RequestMapping("/showRegister")
	public String showPage(){
		return "register";
	}
	
	/*
	 * 病人登录功能
	 */
	@RequestMapping("/loginPatient")
	public String findPatient(TPatient patient,HttpSession session){
		if(patient.getPatientId()==null){
			return "login";
		}
		TPatient pa=loginService.findPatient(patient.getPatientId());
		if(pa==null){
			return "login";
		}
		if(pa.getPatientPassword().equals(patient.getPatientPassword())){
			session.setAttribute("patientName",pa.getPatientName());
			return "forward:patientMain.action";
		}
		return "login";
	}
	
	/*
	 * 挂号员登录功能
	 */
	@RequestMapping("/loginStaff")
	public String findStaff(TStaff staff,HttpSession session){
		if(staff.getStaffId()==null){
			return "login";
		}
		TStaff st=loginService.findStaff(staff.getStaffId());
		if(st==null){
			return "login";
		}
		if(st.getStaffPassword().equals(staff.getStaffPassword())){
			session.setAttribute("staffName", st.getStaffName());
			return "forward:staffMain.action";
		}
		return "login";
	}
	
	/*
	 * 注册功能
	 */
	@RequestMapping("/register")
	public String register(TPatient patient,HttpSession session){
		if(patient.getPatientId()==null){
			return "login";
		}
		//插入数据
		patientService.insertPatient(patient);
		//检查是否注册成功
		TPatient tp=loginService.findPatient(patient.getPatientId());
		if(tp==null){
			return "forward:register.action";
		}
		session.setAttribute("patientName", patient.getPatientName());
		return "forward:patientMain.action";
	}
	
	/*
	 * 登出功能
	 */
	@RequestMapping("/logout")
	public String Logout(HttpSession session){
		session.invalidate();
		return "forward:login.action";
	}
	
	
}
