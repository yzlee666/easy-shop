package com.yzlee.goods.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:lyz
 * @Date: 2018/3/23 15:49
 * @Desc:
 **/
@Controller
@RequestMapping(value="/admin/goods")
public class ManageGoodsQueryController
{

    @GetMapping(value="/aa.html")
    public String toHeHe(){
        System.out.println("DSfdsf");
        return "goods/test";
    }

    @GetMapping(value="/list.html")
    public void list(){
    }

}
