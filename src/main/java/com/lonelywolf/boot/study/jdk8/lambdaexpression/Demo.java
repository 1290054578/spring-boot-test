package com.lonelywolf.boot.study.jdk8.lambdaexpression;

import lombok.Data;

import java.util.*;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-31 17:20
 * @Description:
 */
public class Demo {
    @Data
    static class DemoUser{
        DemoUser(int number){
            this.number = number;
        }
        private int number;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        list.forEach(str -> System.out.println(str));
        list.forEach(System.out::print);


        /**
         * jdk8新特效遍历
         */
        Map<String,Object> map = new HashMap<>(2);
        map.put("1",123456);
        List<Map<String,Object>> mapList = new ArrayList<>();
        mapList.add(map);
        //foreach--->等同于for循环
        mapList.forEach(stringObjectMap -> System.out.println(stringObjectMap.get("1")));


        List<DemoUser> demoUserList = new ArrayList<>();
        demoUserList.add(new DemoUser(1));
        demoUserList.add(new DemoUser(2));
        demoUserList.add(new DemoUser(13));
        //遍历求和
        System.out.println(demoUserList.stream().mapToLong(DemoUser::getNumber).sum());


    }



}
