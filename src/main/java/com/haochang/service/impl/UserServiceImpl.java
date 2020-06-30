package com.haochang.service.impl;

import com.haochang.mapper.FrUserMapper;
import com.haochang.model.FrUser;
import com.haochang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 描述：用户服务service实现类
 * @author: youzhi.gao
 * @date: 2020-06-30 11:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FrUserMapper frUserMapper;

    @Override
    public FrUser findFrUserByLoginName(String loginName) {
        return frUserMapper.selectByLoginName(loginName);
    }
}
