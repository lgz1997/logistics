package com.ytc.model;

import java.io.Serializable;

public class City implements Serializable {
    private static final long serialVersionUID = -4331725965825039766L;
    private Integer cityid;

    private String cityname;

    private Integer provinceid;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityid=" + cityid +
                ", cityname='" + cityname + '\'' +
                ", provinceid=" + provinceid +
                '}';
    }
}