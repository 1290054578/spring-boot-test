package com.lonelywolf.boot.localdatasource.mydemo.vo;

import lombok.Data;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-03 15:15
 * @Description:
 */
@Data
public class TestUserVO {
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

    private Integer current;

    private Integer pageSize;
}
