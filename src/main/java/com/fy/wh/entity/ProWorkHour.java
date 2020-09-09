package com.fy.wh.entity;

import java.util.Date;

public class ProWorkHour {
    private Integer id;
    private Integer puiPiId;
    private Integer puiSuId;
    private Double puiWorkHour;
    private Date puiInputDt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPuiPiId() {
        return puiPiId;
    }

    public void setPuiPiId(Integer puiPiId) {
        this.puiPiId = puiPiId;
    }

    public Integer getPuiSuId() {
        return puiSuId;
    }

    public void setPuiSuId(Integer puiSuId) {
        this.puiSuId = puiSuId;
    }

    public Double getPuiWorkHour() {
        return puiWorkHour;
    }

    public void setPuiWorkHour(Double puiWorkHour) {
        this.puiWorkHour = puiWorkHour;
    }

    public Date getPuiInputDt() {
        return puiInputDt;
    }

    public void setPuiInputDt(Date puiInputDt) {
        this.puiInputDt = puiInputDt;
    }
}
