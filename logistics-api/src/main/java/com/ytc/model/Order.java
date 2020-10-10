package com.ytc.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private static final long serialVersionUID = 8691588002756095422L;
    private String ordercard;

    private Integer orderstatus;

    private Integer orderid;

    private String shipper;

    private String consignee;

    private String shipperiphone;

    private String consigneeiphone;

    private String shipperaddress;

    private String consigneeaddress;

    private String orderdate;

    private Integer suserid;

    private Integer cuserid;

    private Goods goods;

    private Harvest harvest;

    private Freight freight;

    private Accept accept;

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOrdercard() {
        return ordercard;
    }

    public void setOrdercard(String ordercard) {
        this.ordercard = ordercard;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Harvest getHarvest() {
        return harvest;
    }

    public void setHarvest(Harvest harvest) {
        this.harvest = harvest;
    }

    public Freight getFreight() {
        return freight;
    }

    public void setFreight(Freight freight) {
        this.freight = freight;
    }

    public Accept getAccept() {
        return accept;
    }

    public void setAccept(Accept accept) {
        this.accept = accept;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper == null ? null : shipper.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getShipperiphone() {
        return shipperiphone;
    }

    public void setShipperiphone(String shipperiphone) {
        this.shipperiphone = shipperiphone == null ? null : shipperiphone.trim();
    }

    public String getConsigneeiphone() {
        return consigneeiphone;
    }

    public void setConsigneeiphone(String consigneeiphone) {
        this.consigneeiphone = consigneeiphone == null ? null : consigneeiphone.trim();
    }

    public String getShipperaddress() {
        return shipperaddress;
    }

    public void setShipperaddress(String shipperaddress) {
        this.shipperaddress = shipperaddress == null ? null : shipperaddress.trim();
    }

    public String getConsigneeaddress() {
        return consigneeaddress;
    }

    public void setConsigneeaddress(String consigneeaddress) {
        this.consigneeaddress = consigneeaddress == null ? null : consigneeaddress.trim();
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public Integer getSuserid() {
        return suserid;
    }

    public void setSuserid(Integer suserid) {
        this.suserid = suserid;
    }

    public Integer getCuserid() {
        return cuserid;
    }

    public void setCuserid(Integer cuserid) {
        this.cuserid = cuserid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordercard='" + ordercard + '\'' +
                ", orderstatus=" + orderstatus +
                ", orderid=" + orderid +
                ", shipper='" + shipper + '\'' +
                ", consignee='" + consignee + '\'' +
                ", shipperiphone='" + shipperiphone + '\'' +
                ", consigneeiphone='" + consigneeiphone + '\'' +
                ", shipperaddress='" + shipperaddress + '\'' +
                ", consigneeaddress='" + consigneeaddress + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", suserid=" + suserid +
                ", cuserid=" + cuserid +
                ", goods=" + goods +
                ", harvest=" + harvest +
                ", freight=" + freight +
                ", accept=" + accept +
                '}';
    }
}