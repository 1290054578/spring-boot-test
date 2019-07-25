package com.lonelywolf.boot.redistool.entity;

import lombok.Data;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-24 17:01
 * @Description:
 */
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String rediskey;
}
