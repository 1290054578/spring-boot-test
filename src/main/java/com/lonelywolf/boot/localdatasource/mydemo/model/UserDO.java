package com.lonelywolf.boot.localdatasource.mydemo.model;

import lombok.Data;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-03 16:12
 * @Description:
 */
@Data
public class UserDO {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;
}
