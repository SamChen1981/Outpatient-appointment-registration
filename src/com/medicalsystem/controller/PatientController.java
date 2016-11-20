package com.medicalsystem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medicalsystem.mapper.TDepartmentMapper;
import com.medicalsystem.pojo.TBasicinfo;
import com.medicalsystem.pojo.TDepartment;
import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.pojo.TSchedulCustom;
import com.medicalsystem.service.BasicInfoService;
import com.medicalsystem.service.PatientService;
import com.medicalsystem.service.SchedulCustomService;

/**
 * 
 * @Title:PatientController
 * @author hxiaope
 * @date 2016年11月10日下午2:50:50
 * @version 1.0
 */
@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	@Autowired
	private SchedulCustomService schedulCustomService;
	@Autowired
	private TDepartmentMapper departmentMapper;
	@Autowired
	private BasicInfoService basicInfoService;
	
	@RequestMapping("/patientMainCon")
	public ModelAndView queryPatient(ModelAndView model,HttpSession session,Long departmentId){
		Long patientId=(Long) session.getAttribute("patientId");
		TPatient patient = patientService.queryMyself(patientId);
		List<TDepartment> departmentList = departmentMapper.selectAll();
		model.addObject("patient", patient);
		model.addObject("departmentList", departmentList);
		model.setViewName("patientMain");
		return model;
	}
	
	@RequestMapping("/showEdit")
	public String showEdit(Model model,HttpSession session){
		Long id= (Long) session.getAttribute("patientId");
		TPatient patient = patientService.queryMyself(id);
		model.addAttribute("patient", patient);
		return "editPatient";
	}
	
	@RequestMapping("/editPatientSubmit")
	public String editSubmit(TPatient patient){
		patientService.updatePatient(patient);
		return "forward:patientMainCon";
	}
	
	@RequestMapping("/schedul/{departmentId}")
	public String getSchedul(@PathVariable Long departmentId,Model model){
		 List<TSchedulCustom> list = schedulCustomService.findSchedul(departmentId);
		 model.addAttribute("schedulList", list);
		return "addOrder";
	}
	
	@RequestMapping("/selectguahao")
	@ResponseBody
	public List<TSchedulCustom> getschedulguahao(String departmentId){
		Long dep=Long.parseLong(departmentId);
		List<TSchedulCustom> list = schedulCustomService.findSchedul(dep);
		return list;
	}
	/**
	 * 病人查看公告
	 * @param model
	 * @return
	 */
	@RequestMapping("/findPatientInfo")
	 public String findAllInfo(Model model){
		 List<TBasicinfo> list = basicInfoService.findAllInfo();
		 model.addAttribute("InfoList",list);
		 return "queryInfoPatient";
	 }

}
