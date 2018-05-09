package com.yzlee.goods.data.domain;

import cn.yzlee.data.SuperObject;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * @Author:lyz
 * @Date: 2018/3/23 14:35
 * @Desc:
 **/
@Entity
@Table(name="tb_goods")
@DynamicInsert
@DynamicUpdate
public class Goods extends SuperObject
{
    @Id
    @GeneratedValue
    @Type(type="uuid-char")
    @Column(length=36)
    private UUID id;

    @NaturalId(mutable = true)
    @Column(length = 32,nullable = false,columnDefinition = ("varchar(32) comment '商品编码'"))
    private String code;

    @Column(length = 64,nullable = false,columnDefinition=("varchar(64) comment '商品名称'"))
    private String name;

    @Column(columnDefinition = ("varchar(6000) comment '商品简介'"))
    private String introduce;

    @Column(name="is_hot",nullable = false,columnDefinition = ("tinyint(1) comment '是否热卖'"))
    private Boolean isHot;

    @Column(name="is_new",nullable = false,columnDefinition = ("tinyint(1) comment '是否新品'"))
    private Boolean isNew;

    @Column(name="on_shelf",nullable = false,columnDefinition = ("tinyint(1) comment '是否上架'"))
    private Boolean onShelf;

    @Column(name="cost_price")
    private BigDecimal costPrice;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="stock")
    private long stock;

    @Column(name="sale_num")
    private long saleNum;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Boolean getHot() {
        return isHot;
    }

    public void setHot(Boolean hot) {
        isHot = hot;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getOnShelf() {
        return onShelf;
    }

    public void setOnShelf(Boolean onShelf) {
        this.onShelf = onShelf;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public long getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(long saleNum) {
        this.saleNum = saleNum;
    }
}
