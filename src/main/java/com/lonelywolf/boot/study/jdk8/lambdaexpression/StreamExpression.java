package com.lonelywolf.boot.study.jdk8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

/**
 * [Stream函数式操作流元素集合]
 * @author xiangyong.zeng
 * @param
 * @return
 * @date 2019-08-01 10:00
 */
public class StreamExpression {


    public static void main(String[] args) {
        /**
         * Stream函数式操作流元素集合
         */
        List<Demo.DemoUser> userList = new ArrayList<>();
        userList.add(new Demo.DemoUser(1));
        userList.add(new Demo.DemoUser(3));
        userList.add(new Demo.DemoUser(9));
        userList.add(new Demo.DemoUser(15));
        userList.add(new Demo.DemoUser(9));


        userList
                .stream() //转成Stream
                .filter(team -> team != null) //判断不为空
                .distinct() //去重
                .forEach(demoUser -> { //遍历
                    System.out.println(demoUser);
                });

        System.out.println(userList);

        long c = userList
                .stream()
                .filter(team -> team != null)
                .distinct()
                .mapToLong(map -> map.getNumber()*2)
                .skip(2) //跳过前两个元素
                .limit(4)//限制取前四个元素
                .peek(System.out::println) //流式处理对象函数
                .sum(); //求和

        System.out.println("处理结果"+c);
        System.out.println(userList);
    }

}
