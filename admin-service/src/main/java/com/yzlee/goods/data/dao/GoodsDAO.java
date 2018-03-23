package com.yzlee.goods.data.dao;

import com.yzlee.goods.data.domain.Goods;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:lyz
 * @Date: 2018/3/23 15:35
 * @Desc:
 **/
public interface GoodsDAO
{
    void save(Goods goods);

    void update(Goods goods);

    void saveOrUpdate(Goods goods);

    void merge(Goods goods);

    void delete(Serializable id);

    Goods findById(Serializable id);

    List<Goods> queryPage(String hql, int currentPage, int pageSize);
}
