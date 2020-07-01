package com.haochang.controller;

import com.haochang.service.impl.RedisLuaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：测试redis lua布隆过滤器
 * @author: youzhi.gao
 * @date: 2020-07-01 17:08
 */
@RestController
public class RedisController {

    @Autowired
    private RedisLuaServiceImpl redisLuaService;


    @RequestMapping("/getLuaResult/{value}")
    public void getLuaResult(@PathVariable String value){
        Object result = redisLuaService.bloomFilterAdd(null, value);
        System.out.println(result);
    }
}
