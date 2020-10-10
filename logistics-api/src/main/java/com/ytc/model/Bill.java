package com.ytc.model;

import java.io.Serializable;

public class Bill implements Serializable {
    private static final long serialVersionUID = -5911081828500473801L;
    private Integer billid;

    private String billdealid;

    private String billdate;

    private Integer billtype;

    private Double billprice;

    private Integer suserid;

    public Double getBillprice() {
        return billprice;
    }

    public void setBillprice(Double billprice) {
        this.billprice = billprice;
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public String getBilldealid() {
        return billdealid;
    }

    public void setBilldealid(String billdealid) {
        this.billdealid = billdealid == null ? null : billdealid.trim();
    }

    public String getBilldate() {
        return billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate;
    }

    public Integer getBilltype() {
        return billtype;
    }

    public void setBilltype(Integer billtype) {
        this.billtype = billtype;
    }

    public Integer getSuserid() {
        return suserid;
    }

    public void setSuserid(Integer suserid) {
        this.suserid = suserid;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billid=" + billid +
                ", billdealid='" + billdealid + '\'' +
                ", billdate='" + billdate + '\'' +
                ", billtype=" + billtype +
                ", billprice=" + billprice +
                ", suserid=" + suserid +
                '}';
    }
}