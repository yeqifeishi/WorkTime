package com.fy.wh.entity;

import java.util.Date;

public class SysMenu {
    private Integer id;
    private Integer smParentId;
    private String smName;
    private String smUrl;
    private String smPerms;
    private Integer smType;
    private String smIcon;
    private Integer smOrder;
    private Date smCreateDt;
    private Integer smCreateUid;
    private Date smUpdateDt;
    private Integer smUpdateUid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSmParentId() {
        return smParentId;
    }

    public void setSmParentId(Integer smParentId) {
        this.smParentId = smParentId;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
    }

    public String getSmUrl() {
        return smUrl;
    }

    public void setSmUrl(String smUrl) {
        this.smUrl = smUrl;
    }

    public String getSmPerms() {
        return smPerms;
    }

    public void setSmPerms(String smPerms) {
        this.smPerms = smPerms;
    }

    public Integer getSmType() {
        return smType;
    }

    public void setSmType(Integer smType) {
        this.smType = smType;
    }

    public String getSmIcon() {
        return smIcon;
    }

    public void setSmIcon(String smIcon) {
        this.smIcon = smIcon;
    }

    public Integer getSmOrder() {
        return smOrder;
    }

    public void setSmOrder(Integer smOrder) {
        this.smOrder = smOrder;
    }

    public Date getSmCreateDt() {
        return smCreateDt;
    }

    public void setSmCreateDt(Date smCreateDt) {
        this.smCreateDt = smCreateDt;
    }

    public Integer getSmCreateUid() {
        return smCreateUid;
    }

    public void setSmCreateUid(Integer smCreateUid) {
        this.smCreateUid = smCreateUid;
    }

    public Date getSmUpdateDt() {
        return smUpdateDt;
    }

    public void setSmUpdateDt(Date smUpdateDt) {
        this.smUpdateDt = smUpdateDt;
    }

    public Integer getSmUpdateUid() {
        return smUpdateUid;
    }

    public void setSmUpdateUid(Integer smUpdateUid) {
        this.smUpdateUid = smUpdateUid;
    }
}
