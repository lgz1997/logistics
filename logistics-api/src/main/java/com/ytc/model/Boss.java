package com.ytc.model;

import java.io.Serializable;

public class Boss implements Serializable {
    private static final long serialVersionUID = -6850166170193765944L;
    private Integer bossid;

    private String bossname;

    private String bosspwd;

    public Integer getBossid() {
        return bossid;
    }

    public void setBossid(Integer bossid) {
        this.bossid = bossid;
    }

    public String getBossname() {
        return bossname;
    }

    public void setBossname(String bossname) {
        this.bossname = bossname == null ? null : bossname.trim();
    }

    public String getBosspwd() {
        return bosspwd;
    }

    public void setBosspwd(String bosspwd) {
        this.bosspwd = bosspwd == null ? null : bosspwd.trim();
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossid=" + bossid +
                ", bossname='" + bossname + '\'' +
                ", bosspwd='" + bosspwd + '\'' +
                '}';
    }
}