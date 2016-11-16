package com.medicalsystem.pojo;

public class TDoctor {
    private Long doctorId;

    private String doctorName;

    private String doctorSex;

    private Long doctorType;

    private Long departmentId;

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
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex == null ? null : doctorSex.trim();
    }

    public Long getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(Long doctorType) {
        this.doctorType = doctorType;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}