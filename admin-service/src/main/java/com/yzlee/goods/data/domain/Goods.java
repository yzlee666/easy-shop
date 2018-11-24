package com.yzlee.goods.data.domain;

/**
 * @author lyz
 * @date 2018/11/24 15:57
 * @desc
 **/
public class Goods
{
    private String id;

    private Integer status;

    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
