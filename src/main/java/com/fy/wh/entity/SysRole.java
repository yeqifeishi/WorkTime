package com.fy.wh.entity;

import java.util.Date;

public class SysRole {
    private Integer id;
    private String srName;
    private String srSign;
    private String srRemark;
    private Integer srCreateUid;
    private Date srCreateDt;
    private Date srUpdateDt;
    private Integer srUpdateUid;
    private Character srIssuperadmin;
    private Character srIssysadmin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName;
    }

    public String getSrSign() {
        return srSign;
    }

    public void setSrSign(String srSign) {
        this.srSign = srSign;
    }

    public String getSrRemark() {
        return srRemark;
    }

    public void setSrRemark(String srRemark) {
        this.srRemark = srRemark;
    }

    public Integer getSrCreateUid() {
        return srCreateUid;
    }

    public void setSrCreateUid(Integer srCreateUid) {
        this.srCreateUid = srCreateUid;
    }

    public Date getSrCreateDt() {
        return srCreateDt;
    }

    public void setSrCreateDt(Date srCreateDt) {
        this.srCreateDt = srCreateDt;
    }

    public Date getSrUpdateDt() {
        return srUpdateDt;
    }

    public void setSrUpdateDt(Date srUpdateDt) {
        this.srUpdateDt = srUpdateDt;
    }

    public Integer getSrUpdateUid() {
        return srUpdateUid;
    }

    public void setSrUpdateUid(Integer srUpdateUid) {
        this.srUpdateUid = srUpdateUid;
    }

    public Character getSrIssuperadmin() {
        return srIssuperadmin;
    }

    public void setSrIssuperadmin(Character srIssuperadmin) {
        this.srIssuperadmin = srIssuperadmin;
    }

    public Character getSrIssysadmin() {
        return srIssysadmin;
    }

    public void setSrIssysadmin(Character srIssysadmin) {
        this.srIssysadmin = srIssysadmin;
    }
}
