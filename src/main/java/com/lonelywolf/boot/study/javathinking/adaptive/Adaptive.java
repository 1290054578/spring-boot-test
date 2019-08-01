package com.lonelywolf.boot.study.javathinking.adaptive;

import org.springframework.stereotype.Service;

/**
 * [适配器类]
 * @author xiangyong.zeng
 * @param 
 * @return 
 * @date 2019-08-01 15:36
 * @desciption: 适配器类，继承了被适配类(特殊行为接口实现类)，同时实现标准接口
 */
@Service
public class Adaptive extends AnimalCatImpl implements IAnimalService {

    @Override
    public boolean eat(boolean eat) {
        System.out.println("action:eat");
        return super.eatFish(eat);
    }

    @Override
    public boolean call(boolean call) {
        if(call){
            System.out.println("action:call");
            return true;
        }else{
            System.out.println("action:none");
            return false;
        }
    }

    @Override
    public boolean fly(boolean fly) {
        if(fly){
            System.out.println("action:fly");
            return true;
        }else{
            System.out.println("action:none");
            return false;
        }
    }



}
