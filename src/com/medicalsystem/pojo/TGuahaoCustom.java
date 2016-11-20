package com.medicalsystem.pojo;

/**
 * 挂号的继承扩展类
 * @Title:TGuahaoCustom
 * @author hxiaope
 * @date 2016年11月18日下午5:24:48
 * @version 1.0
 */
public class TGuahaoCustom extends TGuahao {
	private String patientName;
	private String patientSex;
	private String departmentName;
	private String doctorName;
	private String costType;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientSex() {
		return patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getCostType() {
		return costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}
	
	
}
