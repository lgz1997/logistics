package com.ytc.model;

import java.io.Serializable;
import java.util.Date;

public class Draw implements Serializable {
    private static final long serialVersionUID = -4913816539181462305L;
    private Integer drawid;

    private Date drawdate;

    private Double drawamount;

    private String drawbankid;

    private Integer drawstatus;

    public Integer getDrawid() {
        return drawid;
    }

    public void setDrawid(Integer drawid) {
        this.drawid = drawid;
    }

    public Date getDrawdate() {
        return drawdate;
    }

    public void setDrawdate(Date drawdate) {
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

    @Override
    public String toString() {
        return "Draw{" +
                "drawid=" + drawid +
                ", drawdate=" + drawdate +
                ", drawamount=" + drawamount +
                ", drawbankid='" + drawbankid + '\'' +
                ", drawstatus=" + drawstatus +
                '}';
    }
}