package com.haochang.controller;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.haochang.model.FrUser;
import com.haochang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 描述：用户控制器
 * @author: youzhi.gao
 * @date: 2020-06-30 11:30
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    BloomFilter bloomFilter = BloomFilter.create(Funnels.integerFunnel(), 1000000, 0.02);

    @RequestMapping("/findUser")
    public FrUser findUser(String loginName) {
        return userService.findFrUserByLoginName(loginName);
    }
}
