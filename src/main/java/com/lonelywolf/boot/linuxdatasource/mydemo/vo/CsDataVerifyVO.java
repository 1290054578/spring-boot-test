package com.lonelywolf.boot.linuxdatasource.mydemo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 业务入参对象
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-19 14:43
 * @Description:
 */
@Data
public class CsDataVerifyVO {
    @ApiModelProperty(value = "名称" , required = true)
    @NotNull
    @JSONField(name = "commodity_name")
    private String commodityName;

}
