package com.lonelywolf.boot.linuxdatasource.mydemo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 业务入参对象
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-19 14:43
 * @Description:
 */
@Data
public class CsDataVerifyVO {
    @JSONField(name = "commodity_name")
    private String commodityName;

}
