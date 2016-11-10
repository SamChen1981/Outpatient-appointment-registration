package com.medicalsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.service.PatientService;

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
	
	@RequestMapping("/patientMain")
	public ModelAndView queryPatient(Long patientId,ModelAndView model){
		TPatient patient = patientService.queryMyself(patientId);
		model.addObject("patient", patient);
		model.setViewName("patientMain");
		return model;
	}
	
	@RequestMapping("/showEdit")
	public String showEdit(Model model,Long id){
		TPatient patient = patientService.queryMyself(id);
		model.addAttribute("patient", patient);
		return "editPatient";
	}
	
	@RequestMapping("/editPatientSubmit")
	public String editSubmit(TPatient patient){
		patientService.insertPatient(patient);
		return "forward:patientMain.action";
	}

}
