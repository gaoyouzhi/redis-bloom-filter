package com.haochang.service;

/**
 * @ClassName: RedisLuaService
 * @Description TODO
 * @Author: youzhi.gao
 * @Date: 2020-07-01 17:52
 * @Version 1.0.0
 */
public interface RedisLuaService {
    boolean bloomFilterAdd(String filterName, String value);

    boolean bloomFilterExists(String filterName, String value);
}
