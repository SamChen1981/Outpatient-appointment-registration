package com.medicalsystem.pojo;
/**
 * 
 * @Title:TOrderCustom
 * @author hxiaope
 * @date 2016年11月9日上午12:04:06
 * @version 1.0
 */
public class TOrderCustom{
	private Long orderId;
	private String patientName;
	private String departmentName;
	private Long costPrice;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Long getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}
}
