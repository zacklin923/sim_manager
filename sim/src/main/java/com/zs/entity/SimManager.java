package com.zs.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.runners.Parameterized.Parameters;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SimManager {
    private BigDecimal id;//id

    private String stano;//条码

    private String stanoMan;//负责人

    private String phone;//电话号码

    private String simNumber;//SIM卡号

    private String createMan;

    private Date createTime;

    private Date updateTime;

    private BigDecimal isHistory;

    private String state;//状态

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getStano() {
        return stano;
    }

    public void setStano(String stano) {
        this.stano = stano == null ? null : stano.trim();
    }

    public String getStanoMan() {
        return stanoMan;
    }

    public void setStanoMan(String stanoMan) {
        this.stanoMan = stanoMan == null ? null : stanoMan.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber == null ? null : simNumber.trim();
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan == null ? null : createMan.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getIsHistory() {
        return isHistory;
    }

    public void setIsHistory(BigDecimal isHistory) {
        this.isHistory = isHistory;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}