package com.lonelywolf.boot.linuxdatasource.mydemo.controller;


import com.lonelywolf.boot.linuxdatasource.mydemo.entity.CsDataVerify;
import com.lonelywolf.boot.linuxdatasource.mydemo.service.ICsDataVerifyService;
import com.lonelywolf.boot.linuxdatasource.mydemo.vo.CsDataVerifyVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/data/verify/")
public class CsDataVerifyController {

    @Autowired
    private ICsDataVerifyService iCsDataVerifyService;

    @ApiOperation(value = "查询接口",notes = "查询接口解释")
    @GetMapping
    public List<CsDataVerify> queryAll(@Valid CsDataVerifyVO csDataVerifyVO){
        CsDataVerify csDataVerify = new CsDataVerify();
        return iCsDataVerifyService.queryAll(csDataVerify);
    }

}

