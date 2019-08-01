package com.lonelywolf.boot.study.jdk8.lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * [lambda表达式————将lambda的参数当做方法的参数使用]
 * @author xiangyong.zeng
 * @param
 * @return 
 * @date 2019-07-31 16:39
 */
public class MenthdParams {
    class DemoBean{
        private String demo;
    }


    public static void main(String[] args) {
        Consumer<String> sc = System.out::println;
        sc.accept("618, 狂欢happy");

        Consumer<String> sc2 = (x) -> {System.out.println(x);};
        sc2.accept("618, 狂欢happy");


        //ClassName::staticMethod  类的静态方法：把表达式的参数值作为staticMethod方法的参数
        Function<Integer, String> sf = String::valueOf;
        String apply1 = sf.apply(61888);
        System.out.println(apply1);

        //等效
        Function<Integer, String> sf2 = (x) -> String.valueOf(x);
        System.out.println(sf2.apply(564));
    }
}
