package com.ytc.model;

import java.io.Serializable;

public class Cuser implements Serializable {
    private static final long serialVersionUID = -3111598179589580691L;
    private Integer cuserid;

    private String cusername;

    private String cuserpwd;

    private String cuseriphone;

    private String cusercard;

    private String cuserbankname;

    private String cuserbankid;

    public Integer getCuserid() {
        return cuserid;
    }

    public void setCuserid(Integer cuserid) {
        this.cuserid = cuserid;
    }

    public String getCusername() {
        return cusername;
    }

    public void setCusername(String cusername) {
        this.cusername = cusername == null ? null : cusername.trim();
    }

    public String getCuserpwd() {
        return cuserpwd;
    }

    public void setCuserpwd(String cuserpwd) {
        this.cuserpwd = cuserpwd == null ? null : cuserpwd.trim();
    }

    public String getCuseriphone() {
        return cuseriphone;
    }

    public void setCuseriphone(String cuseriphone) {
        this.cuseriphone = cuseriphone == null ? null : cuseriphone.trim();
    }

    public String getCusercard() {
        return cusercard;
    }

    public void setCusercard(String cusercard) {
        this.cusercard = cusercard == null ? null : cusercard.trim();
    }

    public String getCuserbankname() {
        return cuserbankname;
    }

    public void setCuserbankname(String cuserbankname) {
        this.cuserbankname = cuserbankname == null ? null : cuserbankname.trim();
    }

    public String getCuserbankid() {
        return cuserbankid;
    }

    public void setCuserbankid(String cuserbankid) {
        this.cuserbankid = cuserbankid == null ? null : cuserbankid.trim();
    }

    @Override
    public String toString() {
        return "Cuser{" +
                "cuserid=" + cuserid +
                ", cusername='" + cusername + '\'' +
                ", cuserpwd='" + cuserpwd + '\'' +
                ", cuseriphone='" + cuseriphone + '\'' +
                ", cusercard='" + cusercard + '\'' +
                ", cuserbankname='" + cuserbankname + '\'' +
                ", cuserbankid='" + cuserbankid + '\'' +
                '}';
    }
}