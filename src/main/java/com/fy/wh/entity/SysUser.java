package com.fy.wh.entity;

import java.util.Date;

public class SysUser {
    private Integer id;
    private String suName;
    private String suLoginName;
    private String suLoginPasswd;
    private Integer suSex;
    private Date suBirthDt;
    private String suIcon;
    private String suAddress;
    private String suProvince;
    private String suCity;
    private String suDistrict;
    private Integer suDeptId;
    private String suEmail;
    private String suMobile;
    private Integer suStatus;
    private Integer suCreateUid;
    private Date suCreateDt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName;
    }

    public String getSuLoginName() {
        return suLoginName;
    }

    public void setSuLoginName(String suLoginName) {
        this.suLoginName = suLoginName;
    }

    public String getSuLoginPasswd() {
        return suLoginPasswd;
    }

    public void setSuLoginPasswd(String suLoginPasswd) {
        this.suLoginPasswd = suLoginPasswd;
    }

    public Integer getSuSex() {
        return suSex;
    }

    public void setSuSex(Integer suSex) {
        this.suSex = suSex;
    }

    public Date getSuBirthDt() {
        return suBirthDt;
    }

    public void setSuBirthDt(Date suBirthDt) {
        this.suBirthDt = suBirthDt;
    }

    public String getSuIcon() {
        return suIcon;
    }

    public void setSuIcon(String suIcon) {
        this.suIcon = suIcon;
    }

    public String getSuAddress() {
        return suAddress;
    }

    public void setSuAddress(String suAddress) {
        this.suAddress = suAddress;
    }

    public String getSuProvince() {
        return suProvince;
    }

    public void setSuProvince(String suProvince) {
        this.suProvince = suProvince;
    }

    public String getSuCity() {
        return suCity;
    }

    public void setSuCity(String suCity) {
        this.suCity = suCity;
    }

    public String getSuDistrict() {
        return suDistrict;
    }

    public void setSuDistrict(String suDistrict) {
        this.suDistrict = suDistrict;
    }

    public Integer getSuDeptId() {
        return suDeptId;
    }

    public void setSuDeptId(Integer suDeptId) {
        this.suDeptId = suDeptId;
    }

    public String getSuEmail() {
        return suEmail;
    }

    public void setSuEmail(String suEmail) {
        this.suEmail = suEmail;
    }

    public String getSuMobile() {
        return suMobile;
    }

    public void setSuMobile(String suMobile) {
        this.suMobile = suMobile;
    }

    public Integer getSuStatus() {
        return suStatus;
    }

    public void setSuStatus(Integer suStatus) {
        this.suStatus = suStatus;
    }

    public Integer getSuCreateUid() {
        return suCreateUid;
    }

    public void setSuCreateUid(Integer suCreateUid) {
        this.suCreateUid = suCreateUid;
    }

    public Date getSuCreateDt() {
        return suCreateDt;
    }

    public void setSuCreateDt(Date suCreateDt) {
        this.suCreateDt = suCreateDt;
    }
}
