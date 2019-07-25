package com.lonelywolf.boot.redistool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * [redis配置]
 * @author xiangyong.zeng
 * @param null
 * @return
 * @date 2019-07-24 16:37
 */
@Configuration
public class RedisConfig {


    /**
     * @param redisConnectionFactory
     * @return 自定义redisTemplate，自带的bean没有序列化器
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //设置key的序列化器
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置值的序列化器
        redisTemplate.setValueSerializer(new RedisConverter());
        return redisTemplate;
    }
}