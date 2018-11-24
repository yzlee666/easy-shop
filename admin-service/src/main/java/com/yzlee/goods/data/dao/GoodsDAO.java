package com.yzlee.goods.data.dao;

import com.yzlee.goods.data.domain.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author lyz
 * @date 2018/11/24 15:58
 * @desc
 **/
@Mapper
public interface GoodsDAO
{
    @Select("select * from tb_goods where id = #{id}")
    Goods findGoodsById(@Param("id") String id);

    @Insert("insert  into tb_goods (id,status,name) values (#{id},#{status},#{name})")
    int insert(@Param("id")String id,@Param("status")Integer status,@Param("name")String name);
}
