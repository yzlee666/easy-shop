package com.yzlee.goods.service;

import com.yzlee.goods.data.dao.GoodsDAO;
import com.yzlee.goods.data.domain.Goods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceApplicationTests {

	@Autowired
	private GoodsDAO goodsDAO;
	@Test
	public void contextLoads() {
		goodsDAO.insert("1",1,"111111111111");
		Goods goods = goodsDAO.findGoodsById("1");
		Assert.assertEquals("1",goods.getId());
	}

}
