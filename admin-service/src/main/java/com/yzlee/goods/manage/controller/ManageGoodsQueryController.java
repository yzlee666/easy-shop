package com.yzlee.goods.manage.controller;

import com.yzlee.goods.data.dao.GoodsDAO;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping(value="/list.html")
    public void list(){
    }

    @Autowired
    private GoodsDAO goodsDAO;

}
