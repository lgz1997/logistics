package com.ytc.model;

import java.io.Serializable;

public class Freightcalculation implements Serializable {
    private static final long serialVersionUID = 6611782740488973351L;
    private Integer calculationid;

    private Integer calculationweight1;

    private Integer calculationweight2;

    private Double calculationprice;

    public Integer getCalculationid() {
        return calculationid;
    }

    public void setCalculationid(Integer calculationid) {
        this.calculationid = calculationid;
    }

    public Integer getCalculationweight1() {
        return calculationweight1;
    }

    public void setCalculationweight1(Integer calculationweight1) {
        this.calculationweight1 = calculationweight1;
    }

    public Integer getCalculationweight2() {
        return calculationweight2;
    }

    public void setCalculationweight2(Integer calculationweight2) {
        this.calculationweight2 = calculationweight2;
    }

    public Double getCalculationprice() {
        return calculationprice;
    }

    public void setCalculationprice(Double calculationprice) {
        this.calculationprice = calculationprice;
    }

    @Override
    public String toString() {
        return "Freightcalculation{" +
                "calculationid=" + calculationid +
                ", calculationweight1=" + calculationweight1 +
                ", calculationweight2=" + calculationweight2 +
                ", calculationprice=" + calculationprice +
                '}';
    }
}