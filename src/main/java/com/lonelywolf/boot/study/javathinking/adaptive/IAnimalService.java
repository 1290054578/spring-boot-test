package com.lonelywolf.boot.study.javathinking.adaptive;

/**
 * [标准接口类]
 * @author xiangyong.zeng
 * @param
 * @return 
 * @date 2019-08-01 15:38
 * @description: 定义标准接口
 */
public interface IAnimalService {
    /**
     * 动物行为
     */

    /**
     * [飞]
     * @author xiangyong.zeng
     * @param fly
     * @return boolean
     * @date 2019-08-01 14:32
     */
    boolean fly(boolean fly);
    
    /**
     * [叫]
     * @author xiangyong.zeng
     * @param call
     * @return boolean
     * @date 2019-08-01 14:32
     */
    boolean call(boolean call);

    /**
     * [吃]
     * @author xiangyong.zeng
     * @param eat
     * @return boolean
     * @date 2019-08-01 15:41
     */
    boolean eat(boolean eat);
}
