package com.yzlee.member.domain;

/**
 * @Author:lyz
 * @Date: 2018/3/22 16:05
 * @Desc:
 **/
public enum Sex
{
    MALE("男"),FEMALE("女"),UNKNOW("未知");

    Sex(String desc){
        this.desc=desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
