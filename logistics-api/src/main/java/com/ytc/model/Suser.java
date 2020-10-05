package com.ytc.model;

import java.io.Serializable;

public class Suser implements Serializable {
    private static final long serialVersionUID = -3139709676596829368L;
    private Integer suserid;

    private String susername;

    private String suserpwd;

    private String compoayname;

    private String compoayiphone;

    private String compoaybossname;

    private String compoayaddress;

    private Integer suserstatus;

    public Integer getSuserid() {
        return suserid;
    }

    public void setSuserid(Integer suserid) {
        this.suserid = suserid;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername == null ? null : susername.trim();
    }

    public String getSuserpwd() {
        return suserpwd;
    }

    public void setSuserpwd(String suserpwd) {
        this.suserpwd = suserpwd == null ? null : suserpwd.trim();
    }

    public String getCompoayname() {
        return compoayname;
    }

    public void setCompoayname(String compoayname) {
        this.compoayname = compoayname == null ? null : compoayname.trim();
    }

    public String getCompoayiphone() {
        return compoayiphone;
    }

    public void setCompoayiphone(String compoayiphone) {
        this.compoayiphone = compoayiphone == null ? null : compoayiphone.trim();
    }

    public String getCompoaybossname() {
        return compoaybossname;
    }

    public void setCompoaybossname(String compoaybossname) {
        this.compoaybossname = compoaybossname == null ? null : compoaybossname.trim();
    }

    public String getCompoayaddress() {
        return compoayaddress;
    }

    public void setCompoayaddress(String compoayaddress) {
        this.compoayaddress = compoayaddress == null ? null : compoayaddress.trim();
    }

    public Integer getSuserstatus() {
        return suserstatus;
    }

    public void setSuserstatus(Integer suserstatus) {
        this.suserstatus = suserstatus;
    }

    @Override
    public String toString() {
        return "Suser{" +
                "suserid=" + suserid +
                ", susername='" + susername + '\'' +
                ", suserpwd='" + suserpwd + '\'' +
                ", compoayname='" + compoayname + '\'' +
                ", compoayiphone='" + compoayiphone + '\'' +
                ", compoaybossname='" + compoaybossname + '\'' +
                ", compoayaddress='" + compoayaddress + '\'' +
                ", suserstatus=" + suserstatus +
                '}';
    }
}