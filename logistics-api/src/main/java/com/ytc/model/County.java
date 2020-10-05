package com.ytc.model;

import java.io.Serializable;

public class County implements Serializable {
    private static final long serialVersionUID = 1482580101485788283L;
    private Integer countyid;

    private String countyname;

    private String cityid;

    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname == null ? null : countyname.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    @Override
    public String toString() {
        return "County{" +
                "countyid=" + countyid +
                ", countyname='" + countyname + '\'' +
                ", cityid='" + cityid + '\'' +
                '}';
    }
}