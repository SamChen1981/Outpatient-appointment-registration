package com.medicalsystem.pojo;

import java.util.Date;

/**
 * 
 * @Title:TSchedulCustom
 * @author hxiaope
 * @date 2016年11月13日下午8:27:46
 * @version 1.0
 */
public class TSchedulCustom {
	private Long departmentId;
	private String departmentName;
	private Long doctorId;
	private String doctorName;
	private Long costId;
	private String costType;
	private Date schedultime;
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Long getCostId() {
		return costId;
	}
	public void setCostId(Long costId) {
		this.costId = costId;
	}
	public String getCostType() {
		return costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}
	public Date getSchedultime() {
		return schedultime;
	}
	public void setSchedultime(Date schedultime) {
		this.schedultime = schedultime;
	}
}
