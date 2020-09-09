package com.fy.wh.entity;

import java.util.Date;

public class SysDict {
    private Integer id;
    private String sdName;
    private String sdValue;
    private String sdType;
    private String sdDesc;
    private Integer sdOrder;
    private Integer sdParentId;
    private Integer sdCreateUid;
    private Date sdCreateDt;
    private Integer sdUpdateUid;
    private Date sdUpdateDt;
    private String sdRemark;
    private Character sdDelFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSdName() {
        return sdName;
    }

    public void setSdName(String sdName) {
        this.sdName = sdName;
    }

    public String getSdValue() {
        return sdValue;
    }

    public void setSdValue(String sdValue) {
        this.sdValue = sdValue;
    }

    public String getSdType() {
        return sdType;
    }

    public void setSdType(String sdType) {
        this.sdType = sdType;
    }

    public String getSdDesc() {
        return sdDesc;
    }

    public void setSdDesc(String sdDesc) {
        this.sdDesc = sdDesc;
    }

    public Integer getSdOrder() {
        return sdOrder;
    }

    public void setSdOrder(Integer sdOrder) {
        this.sdOrder = sdOrder;
    }

    public Integer getSdParentId() {
        return sdParentId;
    }

    public void setSdParentId(Integer sdParentId) {
        this.sdParentId = sdParentId;
    }

    public Integer getSdCreateUid() {
        return sdCreateUid;
    }

    public void setSdCreateUid(Integer sdCreateUid) {
        this.sdCreateUid = sdCreateUid;
    }

    public Date getSdCreateDt() {
        return sdCreateDt;
    }

    public void setSdCreateDt(Date sdCreateDt) {
        this.sdCreateDt = sdCreateDt;
    }

    public Integer getSdUpdateUid() {
        return sdUpdateUid;
    }

    public void setSdUpdateUid(Integer sdUpdateUid) {
        this.sdUpdateUid = sdUpdateUid;
    }

    public Date getSdUpdateDt() {
        return sdUpdateDt;
    }

    public void setSdUpdateDt(Date sdUpdateDt) {
        this.sdUpdateDt = sdUpdateDt;
    }

    public String getSdRemark() {
        return sdRemark;
    }

    public void setSdRemark(String sdRemark) {
        this.sdRemark = sdRemark;
    }

    public Character getSdDelFlag() {
        return sdDelFlag;
    }

    public void setSdDelFlag(Character sdDelFlag) {
        this.sdDelFlag = sdDelFlag;
    }
}
