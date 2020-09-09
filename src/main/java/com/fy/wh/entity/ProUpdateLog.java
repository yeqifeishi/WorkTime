package com.fy.wh.entity;

import java.util.Date;

public class ProUpdateLog {
    private Integer id;
    private Integer pulPiId;
    private Integer pulUpdateUid;
    private Date pulUpdateDt;
    private String pulUpdateContents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPulPiId() {
        return pulPiId;
    }

    public void setPulPiId(Integer pulPiId) {
        this.pulPiId = pulPiId;
    }

    public Integer getPulUpdateUid() {
        return pulUpdateUid;
    }

    public void setPulUpdateUid(Integer pulUpdateUid) {
        this.pulUpdateUid = pulUpdateUid;
    }

    public Date getPulUpdateDt() {
        return pulUpdateDt;
    }

    public void setPulUpdateDt(Date pulUpdateDt) {
        this.pulUpdateDt = pulUpdateDt;
    }

    public String getPulUpdateContents() {
        return pulUpdateContents;
    }

    public void setPulUpdateContents(String pulUpdateContents) {
        this.pulUpdateContents = pulUpdateContents;
    }
}
