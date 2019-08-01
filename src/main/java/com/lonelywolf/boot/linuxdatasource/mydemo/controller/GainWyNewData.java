package com.lonelywolf.boot.linuxdatasource.mydemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-01 11:00
 * @Description:
 */
@RestController
@RequestMapping("/gain/data")
@Api(value = "网易数据扒取")
public class GainWyNewData {


    @ApiModelProperty(value = "数据获取",notes = "扒取网易新闻数据")
    @PostMapping("/start")
    public boolean gainWyNewData(){

        return false;
    }
}
