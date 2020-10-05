package com.ytc.model;

import java.io.Serializable;

public class Harvest implements Serializable {
    private static final long serialVersionUID = -8051945035441221077L;
    private Integer harvestid;

    private Integer harveststatus;

    private Integer orderid;

    public Integer getHarvestid() {
        return harvestid;
    }

    public void setHarvestid(Integer harvestid) {
        this.harvestid = harvestid;
    }

    public Integer getHarveststatus() {
        return harveststatus;
    }

    public void setHarveststatus(Integer harveststatus) {
        this.harveststatus = harveststatus;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "harvestid=" + harvestid +
                ", harveststatus=" + harveststatus +
                ", orderid=" + orderid +
                '}';
    }
}