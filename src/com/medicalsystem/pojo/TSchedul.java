package com.medicalsystem.pojo;

import java.util.Date;

public class TSchedul {
    private Long schedulId;

    private Long departmentId;

    private Long doctorId;

    private Date schedultime;

    private Long costId;

    public Long getSchedulId() {
        return schedulId;
    }

    public void setSchedulId(Long schedulId) {
        this.schedulId = schedulId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Date getSchedultime() {
        return schedultime;
    }

    public void setSchedultime(Date schedultime) {
        this.schedultime = schedultime;
    }

    public Long getCostId() {
        return costId;
    }

    public void setCostId(Long costId) {
        this.costId = costId;
    }
}