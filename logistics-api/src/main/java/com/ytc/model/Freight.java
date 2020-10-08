package com.ytc.model;

import java.io.Serializable;

public class Freight implements Serializable {
    private static final long serialVersionUID = 1371502244733967343L;
    private Integer freightid;

    private Double freightprice;

    private Integer freightstatus;

    private Integer orderid;

    public Integer getFreightid() {
        return freightid;
    }

    public void setFreightid(Integer freightid) {
        this.freightid = freightid;
    }

    public Double getFreightprice() {
        return freightprice;
    }

    public void setFreightprice(Double freightprice) {
        this.freightprice = freightprice;
    }

    public Integer getFreightstatus() {
        return freightstatus;
    }

    public void setFreightstatus(Integer freightstatus) {
        this.freightstatus = freightstatus;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Freight{" +
                "freightid=" + freightid +
                ", freightprice=" + freightprice +
                ", freightstatus=" + freightstatus +
                ", orderid=" + orderid +
                '}';
    }
}