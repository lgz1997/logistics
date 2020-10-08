package com.ytc.model;

import java.io.Serializable;

public class Draw implements Serializable {
    private static final long serialVersionUID = 5858669520823786470L;
    private Integer drawid;

    private String drawdate;

    private Double drawamount;

    private String drawbankid;

    private Integer drawstatus;

    private Integer suserid;

    @java.lang.Override
    public java.lang.String toString() {
        return "Draw{" +
                "drawid=" + drawid +
                ", drawdate='" + drawdate + '\'' +
                ", drawamount=" + drawamount +
                ", drawbankid='" + drawbankid + '\'' +
                ", drawstatus=" + drawstatus +
                ", suserid=" + suserid +
                '}';
    }

    public Integer getDrawid() {
        return drawid;
    }

    public void setDrawid(Integer drawid) {
        this.drawid = drawid;
    }

    public String getDrawdate() {
        return drawdate;
    }

    public void setDrawdate(String drawdate) {
        this.drawdate = drawdate;
    }

    public Double getDrawamount() {
        return drawamount;
    }

    public void setDrawamount(Double drawamount) {
        this.drawamount = drawamount;
    }

    public String getDrawbankid() {
        return drawbankid;
    }

    public void setDrawbankid(String drawbankid) {
        this.drawbankid = drawbankid == null ? null : drawbankid.trim();
    }

    public Integer getDrawstatus() {
        return drawstatus;
    }

    public void setDrawstatus(Integer drawstatus) {
        this.drawstatus = drawstatus;
    }

    public Integer getSuserid() {
        return suserid;
    }

    public void setSuserid(Integer suserid) {
        this.suserid = suserid;
    }
}