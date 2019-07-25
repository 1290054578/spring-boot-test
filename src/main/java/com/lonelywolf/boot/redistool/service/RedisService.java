package com.lonelywolf.boot.redistool.service;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-24 17:23
 * @Description:
 */

public interface RedisService {

    void add(String key, String value);

    void delete(String key);

    String getByKey(String key);
}
