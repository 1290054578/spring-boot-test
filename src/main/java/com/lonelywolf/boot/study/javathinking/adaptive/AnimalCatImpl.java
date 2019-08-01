package com.lonelywolf.boot.study.javathinking.adaptive;

import org.springframework.stereotype.Service;

/**
 * [特殊行为实现类]
 * @author xiangyong.zeng
 * @param
 * @return
 * @date 2019-08-01 16:39
 * @description 特殊行为接口实现类
 */
@Service
public class AnimalCatImpl implements IAnimalCat {

    @Override
    public boolean eatFish(boolean eat) {
        if(eat){
            System.out.println("猫吃鱼");
            return true;
        }else{
            System.out.println("不吃");
            return false;
        }

    }
}
