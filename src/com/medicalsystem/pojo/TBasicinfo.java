package com.medicalsystem.pojo;

public class TBasicinfo {
    private Long basicId;

    private String basicHumidity;

    private String basicTemperature;

    private Long departmentId;

    private Long costId;

    private String info;

    public Long getBasicId() {
        return basicId;
    }

    public void setBasicId(Long basicId) {
        this.basicId = basicId;
    }

    public String getBasicHumidity() {
        return basicHumidity;
    }

    public void setBasicHumidity(String basicHumidity) {
        this.basicHumidity = basicHumidity == null ? null : basicHumidity.trim();
    }

    public String getBasicTemperature() {
        return basicTemperature;
    }

    public void setBasicTemperature(String basicTemperature) {
        this.basicTemperature = basicTemperature == null ? null : basicTemperature.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getCostId() {
        return costId;
    }

    public void setCostId(Long costId) {
        this.costId = costId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}