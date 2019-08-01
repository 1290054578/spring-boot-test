package com.lonelywolf.boot.study.javathinking.adaptive;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * [Cilent]
 * @author xiangyong.zeng
 * @param
 * @return
 * @date 2019-08-01 15:36
 * @description: 与符合Target接口的对象协同
 */
@RestController
@RequestMapping("/adaptive/operation")
@Api(description = "适配器测试")
public class AdaptiveController {

    @Autowired
    IAnimalService iAnimalService ;

    @ApiOperation(value = "适配器测试",notes = "接口适配器动作测试")
    @GetMapping("/action")
    public void adaptive(@Valid @NotNull @RequestParam Integer animal){
        iAnimalService.fly(false);
        iAnimalService.call(true);
        iAnimalService.eat(true);
    }

}
