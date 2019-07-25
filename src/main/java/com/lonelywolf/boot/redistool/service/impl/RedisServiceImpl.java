package com.lonelywolf.boot.redistool.service.impl;

import com.lonelywolf.boot.redistool.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-25 13:52
 * @Description:
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public void add(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public void delete(String key){
        redisTemplate.delete(key);
    }

    @Override
    public String getByKey(String key){
        return redisTemplate.opsForValue().get(key).toString();
    }
}
