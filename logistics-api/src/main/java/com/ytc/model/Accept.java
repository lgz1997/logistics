package com.ytc.model;

import java.io.Serializable;

public class Accept implements Serializable {
    private static final long serialVersionUID = -5545392095878294650L;
    private Integer acceptid;

    private Integer acceptstatus;

    private String noacceptwhy;

    private Integer orderid;

    public Integer getAcceptid() {
        return acceptid;
    }

    public void setAcceptid(Integer acceptid) {
        this.acceptid = acceptid;
    }

    public Integer getAcceptstatus() {
        return acceptstatus;
    }

    public void setAcceptstatus(Integer acceptstatus) {
        this.acceptstatus = acceptstatus;
    }

    public String getNoacceptwhy() {
        return noacceptwhy;
    }

    public void setNoacceptwhy(String noacceptwhy) {
        this.noacceptwhy = noacceptwhy == null ? null : noacceptwhy.trim();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Accept{" +
                "acceptid=" + acceptid +
                ", acceptstatus=" + acceptstatus +
                ", noacceptwhy='" + noacceptwhy + '\'' +
                ", orderid=" + orderid +
                '}';
    }
}