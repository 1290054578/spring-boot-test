package com.lonelywolf.boot.redistool.entity;

import lombok.Data;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-24 17:01
 * @Description:
 */
@Data
public class User {

    public User(Integer id,String name){
        this.id = id;
        this.username = name;
    }

    private Integer id;
    private String username;
    private String password;
    private String rediskey;
}
