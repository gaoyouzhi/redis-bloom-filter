package com.haochang.controller;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.math.BigDecimal;

/**
 * @description: 描述：测试布隆过滤器
 * @author: youzhi.gao
 * @date: 2020-06-30 17:49
 */
public class TestBloomFilter {
    public static int capacity = 1000000;
    public static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), capacity, 0.01);
    public static void main(String[] args) {

        for (int i = 0; i < capacity; i++){
            bloomFilter.put(i);
        }

        int count = 0;
        for (int i = 0; i < capacity; i ++){
            if(!bloomFilter.mightContain(i)){
                System.out.println(i + "逃脱了.....");
                count++;
            }
        }

        System.out.println(count);
        System.out.println("逃脱率:" + BigDecimal.valueOf(count).divide(BigDecimal.valueOf(capacity)).setScale(BigDecimal.ROUND_CEILING));
        int sum = 0;
        for(int i = capacity; i < capacity + 10000; i++){
            if(bloomFilter.mightContain(i)){
                System.out.println(i + "被误伤了。。。");
                sum ++;
            }
        }

        System.out.println(sum);
    }
}
