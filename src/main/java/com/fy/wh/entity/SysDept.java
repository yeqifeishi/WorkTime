package com.fy.wh.entity;

public class SysDept {
    private Integer deptId;
    private Integer deptParentId;
    private String deptName;
    private Integer deptOrder;
    private Integer deptFlag;
    private String deptAddr;
    private String deptContact;
    private String deptPhone;
    private String deptDesc;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptParentId() {
        return deptParentId;
    }

    public void setDeptParentId(Integer deptParentId) {
        this.deptParentId = deptParentId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }

    public Integer getDeptFlag() {
        return deptFlag;
    }

    public void setDeptFlag(Integer deptFlag) {
        this.deptFlag = deptFlag;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr;
    }

    public String getDeptContact() {
        return deptContact;
    }

    public void setDeptContact(String deptContact) {
        this.deptContact = deptContact;
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }
}
