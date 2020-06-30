package com.haochang.service;

import com.haochang.model.FrUser;

/**
 * @description: 描述：用户服务service
 * @author: youzhi.gao
 * @date: 2020-06-30 11:31
 */
public interface UserService {
    FrUser findFrUserByLoginName(String loginName);
}
