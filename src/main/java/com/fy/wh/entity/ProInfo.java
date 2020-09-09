package com.fy.wh.entity;

import java.util.Date;

public class ProInfo {
    private Integer id;
    private String piName;
    private String piDepartment;
    private Integer piCreateUid;
    private Date piCreateDt;
    private Date piPlanStartDt;
    private Date piPlanEndDt;
    private Date piRealStartDt;
    private Date piRealEndDt;
    private Integer piState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPiName() {
        return piName;
    }

    public void setPiName(String piName) {
        this.piName = piName;
    }

    public String getPiDepartment() {
        return piDepartment;
    }

    public void setPiDepartment(String piDepartment) {
        this.piDepartment = piDepartment;
    }

    public Integer getPiCreateUid() {
        return piCreateUid;
    }

    public void setPiCreateUid(Integer piCreateUid) {
        this.piCreateUid = piCreateUid;
    }

    public Date getPiCreateDt() {
        return piCreateDt;
    }

    public void setPiCreateDt(Date piCreateDt) {
        this.piCreateDt = piCreateDt;
    }

    public Date getPiPlanStartDt() {
        return piPlanStartDt;
    }

    public void setPiPlanStartDt(Date piPlanStartDt) {
        this.piPlanStartDt = piPlanStartDt;
    }

    public Date getPiPlanEndDt() {
        return piPlanEndDt;
    }

    public void setPiPlanEndDt(Date piPlanEndDt) {
        this.piPlanEndDt = piPlanEndDt;
    }

    public Date getPiRealStartDt() {
        return piRealStartDt;
    }

    public void setPiRealStartDt(Date piRealStartDt) {
        this.piRealStartDt = piRealStartDt;
    }

    public Date getPiRealEndDt() {
        return piRealEndDt;
    }

    public void setPiRealEndDt(Date piRealEndDt) {
        this.piRealEndDt = piRealEndDt;
    }

    public Integer getPiState() {
        return piState;
    }

    public void setPiState(Integer piState) {
        this.piState = piState;
    }
}
