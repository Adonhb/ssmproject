package edu.etime.ssmproject.model;

import java.math.BigDecimal;
import java.util.Date;

public class Cusorders {
    private String orderid;

    private String cusid;

    private Date ordertime;

    private Integer orderstate;

    private BigDecimal ordertotleprice;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid == null ? null : cusid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public BigDecimal getOrdertotleprice() {
        return ordertotleprice;
    }

    public void setOrdertotleprice(BigDecimal ordertotleprice) {
        this.ordertotleprice = ordertotleprice;
    }
}