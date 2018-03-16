package com.yzlee.goods.api.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:lyz
 * @Date: 2018/3/16 13:26
 * @Desc:
 **/
@RestController
@RequestMapping(value="/api/goods")
public class ProductApiController
{
    @GetMapping(value="/list")
    public String list(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello,test:"+instance.getHost()+", service_id:"+instance.getServiceId());
        return "Hello,World";
    }
    @Autowired
    private DiscoveryClient client;

    private final Logger logger = LoggerFactory.getLogger(getClass());
}
