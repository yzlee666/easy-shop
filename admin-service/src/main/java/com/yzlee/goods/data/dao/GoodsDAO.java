package com.yzlee.goods.data.dao;

import com.yzlee.goods.data.domain.Goods;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * @Author:lyz
 * @Date: 2018/3/23 15:35
 * @Desc:
 **/
public interface GoodsDAO extends CrudRepository<Goods,UUID>
{
}
