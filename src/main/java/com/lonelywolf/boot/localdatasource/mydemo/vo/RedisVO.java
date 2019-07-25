package com.lonelywolf.boot.localdatasource.mydemo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-25 11:43
 * @Description:
 */
@Data
public class RedisVO {

    @ApiModelProperty(required = true,value = "键")
    @NotNull
    private String key;

    @ApiModelProperty(required = true,value = "值")
    @NotNull
    private String value;

    @ApiModelProperty(required = false,value = "过期时间")
    private Long timeout;
}
