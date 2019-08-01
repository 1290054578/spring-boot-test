package com.lonelywolf.boot.study.jdk8.lambdaexpression;


import com.lonelywolf.boot.redistool.entity.User;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * [lambda表达式，无参构造函数]
 * @author xiangyong.zeng
 * @param
 * @return
 * @date 2019-07-31 16:51
 */
public class StructureExpression {



    public static void main(String[] args) {

        //一个参数,参数类型不同则会编译出错
        Function<Integer, User> uf = id -> new User(1,null);
        //或加括号
        Function<Integer, User> uf2 = (id) -> new User(id,null);
        //等效
        Function<Integer, User> uf3 = (Integer id) -> new User(id,null);
        User apply = uf.apply(61888);
        System.out.println(apply);


        //两个参数
        BiFunction<Integer, String, User> ubf = (id, name) -> new User(id, name);
        User happy = ubf.apply(618, "狂欢happy");
        System.out.println(happy);
        /**
         *  | 等价于
         *  |
         *  v
         */
        User user = new User(618,"狂欢happy");

    }

}
