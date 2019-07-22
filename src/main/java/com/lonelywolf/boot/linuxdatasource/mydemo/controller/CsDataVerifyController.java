package com.lonelywolf.boot.linuxdatasource.mydemo.controller;


import com.lonelywolf.boot.linuxdatasource.mydemo.entity.CsDataVerify;
import com.lonelywolf.boot.linuxdatasource.mydemo.model.CsDataVerifyDO;
import com.lonelywolf.boot.linuxdatasource.mydemo.service.ICsDataVerifyService;
import com.lonelywolf.boot.linuxdatasource.mydemo.vo.CsDataVerifyVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/datatest/verify/")
@Api(description = "swagger测试rest接口用例")
public class CsDataVerifyController {

    @Autowired
    private ICsDataVerifyService iCsDataVerifyService;

    @ApiOperation(value = "查询接口",notes = "查询接口解释")
    @PostMapping
    public List<CsDataVerify> queryAll(@RequestBody @Valid CsDataVerifyVO csDataVerifyVO){
        CsDataVerify csDataVerify = new CsDataVerify();
        return iCsDataVerifyService.queryAll(csDataVerify);
    }

    @ApiOperation(value = "rest规范接口",notes = "rest规范接口描述")
    @GetMapping("/test")
    public List<CsDataVerifyDO> queryAll(@Valid String id){
        CsDataVerify csDataVerify = new CsDataVerify();
        return null;
    }

}

