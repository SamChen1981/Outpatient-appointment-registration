package com.medicalsystem.pojo;

import java.util.Date;

public class TGuahao {
    private Long guahaoId;

    private Long patientId;

    private Long departmentId;

    private Long staffId;

    private Long costId;

    private Date createtime;

    public Long getGuahaoId() {
        return guahaoId;
    }

    public void setGuahaoId(Long guahaoId) {
        this.guahaoId = guahaoId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getCostId() {
        return costId;
    }

    public void setCostId(Long costId) {
        this.costId = costId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}