package com.lonelywolf.boot.study.jdk8.lambdaexpression;


/**
 * [lambda表达式----函数接口]
 * @author xiangyong.zeng
 * @param null
 * @return 
 * @date 2019-07-31 16:01
 */
public class ExpressionInterface {

    interface TestDemo{
        String demoOne();
    }

    /**
     * [lambda,函数时接口实现]
     * @author xiangyong.zeng
     * @param null
     * @return  按照Java8函数式接口的定义，其只能有一个抽象方法，否则就不是函数时接口，就无法用Lambda表达式。
     * @date 2019-07-31 16:00
     */
    interface TestDemoOnePara{
        String demoOne(String name);

    }
    public static void main(String[] args) {
        //接口类实现无入参
        TestDemo testDemo =() -> "no params";
        TestDemo testDemoT = () -> {return "no params two";};
        System.out.println(testDemoT.demoOne());
        System.out.println(testDemo.demoOne());

        //lambda接口实现有单个入参
        String oneName = "lambda实现有单个入参";
        TestDemoOnePara demoHasOne = name -> name;
        TestDemoOnePara demoHasOneT = name -> {return name = "change params";};
        System.out.println(demoHasOne.demoOne(oneName));
        System.out.println(demoHasOneT.demoOne(oneName));
    }
    

}
