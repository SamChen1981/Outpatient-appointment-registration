package com.medicalsystem.pojo;
/**
 * 
 * @Title:TOrderCustom
 * @author hxiaope
 * @date 2016年11月9日上午12:04:06
 * @version 1.0
 */
public class TOrderCustom extends TOrder{
	private TPatient tPatient;
	private TDepartment tDepartment;
	private TCost tCost;
	public TPatient gettPatient() {
		return tPatient;
	}
	public void settPatient(TPatient tPatient) {
		this.tPatient = tPatient;
	}
	public TDepartment gettDepartment() {
		return tDepartment;
	}
	public void settDepartment(TDepartment tDepartment) {
		this.tDepartment = tDepartment;
	}
	public TCost gettCost() {
		return tCost;
	}
	public void settCost(TCost tCost) {
		this.tCost = tCost;
	}
}
