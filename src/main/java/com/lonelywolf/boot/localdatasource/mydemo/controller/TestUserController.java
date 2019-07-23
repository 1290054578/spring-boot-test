package com.lonelywolf.boot.localdatasource.mydemo.controller;


import com.lonelywolf.boot.linuxdatasource.mydemo.vo.CsDataVerifyVO;
import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.lonelywolf.boot.localdatasource.mydemo.service.ITestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-23
 */
@RestController
@RequestMapping("/data/secondary/source")
@Api(description = "swagger文档")
public class TestUserController {

    @Autowired
    private ITestUserService iTestUserService;

    @ApiOperation(value = "查询接口",notes = "查询接口解释")
    @PostMapping
    public List<TestUser> queryAll(@RequestBody @Valid CsDataVerifyVO csDataVerifyVO){
        return iTestUserService.queryAllUser(null);
    }

}

