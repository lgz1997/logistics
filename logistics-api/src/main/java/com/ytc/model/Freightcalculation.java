package com.ytc.model;

import java.io.Serializable;

public class Freightcalculation implements Serializable {
    private static final long serialVersionUID = -1623705600759882713L;
    private Integer calculationid;

    private Double one1;

    private Double one2;

    private Double oneprice;

    private Double two1;

    private Double two2;

    private Double twoprice;

    private Double three1;

    private Double three2;

    private Double threeprice;

    private Integer suserid;

    public Integer getCalculationid() {
        return calculationid;
    }

    public void setCalculationid(Integer calculationid) {
        this.calculationid = calculationid;
    }

    public Double getOne1() {
        return one1;
    }

    public void setOne1(Double one1) {
        this.one1 = one1;
    }

    public Double getOne2() {
        return one2;
    }

    public void setOne2(Double one2) {
        this.one2 = one2;
    }

    public Double getOneprice() {
        return oneprice;
    }

    public void setOneprice(Double oneprice) {
        this.oneprice = oneprice;
    }

    public Double getTwo1() {
        return two1;
    }

    public void setTwo1(Double two1) {
        this.two1 = two1;
    }

    public Double getTwo2() {
        return two2;
    }

    public void setTwo2(Double two2) {
        this.two2 = two2;
    }

    public Double getTwoprice() {
        return twoprice;
    }

    public void setTwoprice(Double twoprice) {
        this.twoprice = twoprice;
    }

    public Double getThree1() {
        return three1;
    }

    public void setThree1(Double three1) {
        this.three1 = three1;
    }

    public Double getThree2() {
        return three2;
    }

    public void setThree2(Double three2) {
        this.three2 = three2;
    }

    public Double getThreeprice() {
        return threeprice;
    }

    public void setThreeprice(Double threeprice) {
        this.threeprice = threeprice;
    }

    public Integer getSuserid() {
        return suserid;
    }

    public void setSuserid(Integer suserid) {
        this.suserid = suserid;
    }

    @Override
    public String toString() {
        return "Freightcalculation{" +
                "calculationid=" + calculationid +
                ", one1=" + one1 +
                ", one2=" + one2 +
                ", oneprice=" + oneprice +
                ", two1=" + two1 +
                ", two2=" + two2 +
                ", twoprice=" + twoprice +
                ", three1=" + three1 +
                ", three2=" + three2 +
                ", threeprice=" + threeprice +
                ", suserid=" + suserid +
                '}';
    }
}