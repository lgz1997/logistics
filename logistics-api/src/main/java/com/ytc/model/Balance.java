package com.ytc.model;

import java.io.Serializable;

public class Balance implements Serializable {
    private static final long serialVersionUID = -721350029176593657L;
    private Integer balanceid;

    private Double balanceprice;

    private Integer suserid;

    public Integer getBalanceid() {
        return balanceid;
    }

    public void setBalanceid(Integer balanceid) {
        this.balanceid = balanceid;
    }

    public Double getBalanceprice() {
        return balanceprice;
    }

    public void setBalanceprice(Double balanceprice) {
        this.balanceprice = balanceprice;
    }

    public Integer getSuserid() {
        return suserid;
    }

    public void setSuserid(Integer suserid) {
        this.suserid = suserid;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "balanceid=" + balanceid +
                ", balanceprice=" + balanceprice +
                ", suserid=" + suserid +
                '}';
    }
}