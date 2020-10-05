package com.ytc.model;

import java.io.Serializable;

public class Province implements Serializable {
    private static final long serialVersionUID = -4744634066382202943L;
    private Integer provinceid;

    private String provincename;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    @Override
    public String toString() {
        return "Province{" +
                "provinceid=" + provinceid +
                ", provincename='" + provincename + '\'' +
                '}';
    }
}