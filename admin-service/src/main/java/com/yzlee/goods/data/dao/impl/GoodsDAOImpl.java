package com.yzlee.goods.data.dao.impl;

import cn.yzlee.hibernate.HibernateBaseDao;
import cn.yzlee.hibernate.HibernateBaseDaoImpl;
import com.yzlee.goods.data.dao.GoodsDAO;
import com.yzlee.goods.data.domain.Goods;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:lyz
 * @Date: 2018/3/23 15:35
 * @Desc:
 **/
@Repository(value="goodsDAO")
public class GoodsDAOImpl extends HibernateBaseDaoImpl<Goods> implements GoodsDAO
{
}
