package com.ytc.model;

import java.io.Serializable;

public class Goods implements Serializable {
    private static final long serialVersionUID = 8473894309466287373L;
    private Integer goodsid;

    private String goodsname;

    private Integer goodscount;

    private Double goodsweight;

    private Integer orderid;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Double getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(Double goodsweight) {
        this.goodsweight = goodsweight;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodscount=" + goodscount +
                ", goodsweight=" + goodsweight +
                ", orderid=" + orderid +
                '}';
    }
}