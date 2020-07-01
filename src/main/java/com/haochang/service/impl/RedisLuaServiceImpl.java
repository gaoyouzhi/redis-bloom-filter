package com.haochang.service.impl;

import com.haochang.service.RedisLuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @description: 描述：利用lua脚本实现布隆过滤器
 * @author: youzhi.gao
 * @date: 2020-07-01 16:48
 */
@Service
public class RedisLuaServiceImpl implements RedisLuaService {

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String BLOOM_FILTER_EXISTS_LUA = "";

    private static final String BLOOM_FILTER_ADD_LUA = "";

    private static double size = Math.pow(2, 32);

    private static final String BLOOM_FILTER_NAME = "{redis_cluster_bloom_filter_vipName}";
    /**
     * 有序集合获取排名
     *
     * @param key
     */
    public Set<ZSetOperations.TypedTuple<Object>> reverseZRankWithRank(String key, long start, long end) {
        ZSetOperations<String, Object> zSet = redisTemplate.opsForZSet();
        Set<ZSetOperations.TypedTuple<Object>> ret = zSet.reverseRangeByScoreWithScores(key, start, end);
        return ret;
    }

    /**
     * 向布隆过滤器中添加值
     * @param value
     * @return
     */
    @Override
    public boolean bloomFilterAdd(String filterName, String value){
        DefaultRedisScript bloomAdd = new DefaultRedisScript();
        bloomAdd.setScriptSource(new ResourceScriptSource(new ClassPathResource("/lua/bloomFilterAdd.lua")));
        bloomAdd.setResultType(Boolean.class);
        List<String> keyList= new ArrayList<>();
        keyList.add(BLOOM_FILTER_NAME);
        keyList.add(value);
        Boolean result = (Boolean) redisTemplate.execute(bloomAdd, keyList, filterName);
        return result;

    }

    /**
     * 校验布隆过滤器中是否存在该值
     */
    @Override
    public boolean bloomFilterExists(String filterName, String value){
        DefaultRedisScript<Boolean> bloomExists= new DefaultRedisScript<>();
        bloomExists.setScriptSource(new ResourceScriptSource(new ClassPathResource("/lua/bloomFilterExists.lua")));
        bloomExists.setResultType(Boolean.class);
        List<String> keyList= new ArrayList<>();
        keyList.add(filterName);
        keyList.add(value);
        Boolean result = (Boolean) redisTemplate.execute(bloomExists,keyList);
        return result;
    }
}
