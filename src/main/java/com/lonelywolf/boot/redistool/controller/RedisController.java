package com.lonelywolf.boot.redistool.controller;

import com.lonelywolf.boot.localdatasource.mydemo.vo.RedisVO;
import com.lonelywolf.boot.redistool.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-25 11:41
 * @Description:
 */
@RestController
@RequestMapping("redis/operation")
@Api(description = "redis操作接口文档")
public class RedisController {

    @Autowired
    private RedisService redisService;

    /**
     * [redis新增]
     * @author xiangyong.zeng
     * @param redisVO
     * @return boolean
     * @date 2019-07-25 11:49
     */
    @ApiModelProperty(value = "redis新增",notes = "redis新增描述")
    @PostMapping("/add")
    public boolean add(@RequestBody @Valid RedisVO redisVO){
        redisService.add(redisVO.getKey(),redisVO.getValue());
        return true;
    }

    /**
     * [redis获取]
     * @author xiangyong.zeng
     * @param redisVO
     * @return java.lang.String
     * @date 2019-07-25 11:49
     */
    @ApiModelProperty(value = "redis获取",notes = "redis获取描述")
    @PostMapping("/get")
    public String get(@RequestBody @Valid RedisVO redisVO){
        return redisService.getByKey(redisVO.getKey());
    }
}
