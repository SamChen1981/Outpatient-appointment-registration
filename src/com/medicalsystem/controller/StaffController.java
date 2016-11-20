package com.medicalsystem.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalsystem.mapper.TDepartmentMapper;
import com.medicalsystem.pojo.TBasicinfo;
import com.medicalsystem.pojo.TDepartment;
import com.medicalsystem.pojo.TGuahao;
import com.medicalsystem.pojo.TGuahaoCustom;
import com.medicalsystem.pojo.TOrderCustomVo;
import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.service.BasicInfoService;
import com.medicalsystem.service.GuahaoCustomService;
import com.medicalsystem.service.GuahaoService;
import com.medicalsystem.service.OrderCustomService;
import com.medicalsystem.service.OrderService;
import com.medicalsystem.service.PatientService;

/**
 * 
 * @Title:StaffController
 * @author hxiaope
 * @date 2016年11月15日上午10:14:59
 * @version 1.0
 */
@Controller
public class StaffController {
	
	@Autowired
	private PatientService patientService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private TDepartmentMapper departmentMapper;
	@Autowired
	private GuahaoService guahaoService;
	@Autowired
	private OrderCustomService orderCustomService;
	@Autowired
	private GuahaoCustomService guahaoCustomService;
	@Autowired
	private BasicInfoService basicInfoService;
	
	
	/**
	 * 根据病人ID模糊查询
	 * @param patientId
	 * @param model
	 * @return
	 */
	@RequestMapping("/findPatientLike")
	public String findPatientLike(Long patientId,Model model){
		List<TPatient> list = patientService.findIdlikeList(patientId);
		List<TDepartment> departmentList = departmentMapper.selectAll();
		model.addAttribute("patientLikeList", list);
		model.addAttribute("departmentList", departmentList);
		return "staffMain";
	}
	/**
	 * 完成挂号操作
	 * @param doctorId
	 * @param departId
	 * @param costType
	 * @param patientId
	 * @param createtime
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addguahao")
	@ResponseBody
	public String submitguahao(Long doctorId,Long departId,Long costType,Long patientId,String createtime,HttpSession session) throws Exception{
		TGuahao guahao = new TGuahao();
		Long staffId=(Long) session.getAttribute("staffId");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=new Date(createtime);
		String dat=sdf.format(d);
		Date date=sdf.parse(dat);
		guahao.setCostId(costType);
		guahao.setCreatetime(date);
		guahao.setStaffId(staffId);
		guahao.setDoctorId(doctorId);
		guahao.setDepartmentId(departId);
		guahao.setPatientId(patientId);
		guahaoService.insertGuahao(guahao);
		return "1";
	}
	
	/**
	 * 待处理预约页面根据病人ID模糊查找病人预约信息
	 * @param patientId
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/findOrderLikePid")
	public String findPatientIdLike(Long patientId,Model model) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date= sdf.format(new Date());
		List<TOrderCustomVo> list1= new ArrayList<>();
		List<TOrderCustomVo> list = orderCustomService.findOrderByPatientId(patientId);
		for(TOrderCustomVo vo:list){
			String getDate=sdf.format(vo.getOrdertime());
			if(getDate.equals(date)){
				Date date2 = sdf.parse(getDate);
				vo.setOrdertime(date2);
				list1.add(vo);
			}
		}
		model.addAttribute("oList", list1);
		return "dealOrder";
	}
	/**
	 * 和上面的Controller相似不过这个是用来响应ajax请求，精确获取病人预约信息
	 * 包括挂号必要信息
	 * @param patientId
	 * @return
	 *//*
	@RequestMapping("/findOrderLikeAjax")
	@ResponseBody
	public List<TOrderCustomVo> findPatientIdAjax(Long patientId){
		List<TOrderCustomVo> list = orderCustomService.findOrderByPatientId(patientId);
		return list;
		}*/
	
	
	
	/**
	 * 处理预约进行挂号，然后删除预约信息
	 * @param doctorId
	 * @param departId
	 * @param costType
	 * @param patientId
	 * @param createtime
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dealwithOrder")
	@ResponseBody
	public String dealwithOrder(Long orderId,Long doctorId,Long departId,Long costType,Long patientId,String createtime,HttpSession session) throws Exception{
		TGuahao guahao = new TGuahao();
		Long staffId=(Long) session.getAttribute("staffId");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(createtime);
		guahao.setCostId(costType);
		guahao.setCreatetime(date);
		guahao.setStaffId(staffId);
		guahao.setDoctorId(doctorId);
		guahao.setDepartmentId(departId);
		guahao.setPatientId(patientId);
		guahaoService.insertGuahao(guahao);
		orderService.deleteOrder(orderId);
		return "1";
	}
	
	
	/**
	 * 根据病人ID查找挂号信息
	 * @param patientId
	 * @param model
	 * @return
	 */
	@RequestMapping("/findGuahaoByPid")
	public String queryGuahaoo(Long patientId,Model model){
		List<TGuahaoCustom> list = guahaoCustomService.findGuahaoByPid(patientId);
		model.addAttribute("gList", list);
		return "cancelguahao";
	}
	
	/**
	 * 删除挂号信息
	 * @param guahaoId
	 * @return
	 */
	@RequestMapping("/deleteGuahao")
	@ResponseBody
	public  String deleteGuahao(Long guahaoId){
		guahaoService.deleteGuahao(guahaoId);
		return "1";
	}
	
	/**
	 * 查询所有的Info数据
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAllInfo")
	 public String findAllInfo(Model model){
		 List<TBasicinfo> list = basicInfoService.findAllInfo();
		 model.addAttribute("InfoList",list);
		 return "queryInfo";
	 }
	 
	/**
	 * 响应ajax请求，根据basicId精确获取信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/findByInfoId")
	@ResponseBody
	public TBasicinfo findByInfoId(Long basicId){
		TBasicinfo basicinfo = basicInfoService.findById(basicId);
		return basicinfo;
	}
	
	/**
	 * 发布公告信息
	 * @return
	 */
	@RequestMapping("/insertInfo")
	@ResponseBody
	public String insertInfo(String title,String info){
		TBasicinfo basicinfo = new TBasicinfo();
		basicinfo.setBasicTitle(title);
		basicinfo.setInfo(info);
		basicInfoService.insertInfo(basicinfo);
		return "1";
	}
}
