package com.lonelywolf.boot.study.javabase;

/**
 * [StringStringBufferStringBuilder分析]
 * @author xiangyong.zeng
 * @return
 * @date 2019-08-02 16:44
 */
public class StringStringBufferStringBuilder {

    public static String uocase(String s){
        return s.toUpperCase();
    }

    public static StringBuilder apendDemo(StringBuilder s){
        return s.append("123");
    }

    public static void main(String[] args) {
        String a = "asd";
        System.out.println(a);

        String aa = uocase(a);
        System.out.println(aa);
        System.out.println(a);


        StringBuilder b = new StringBuilder("asdasd");
        System.out.println(b);

        StringBuilder bb = apendDemo(b);
        System.out.println(b);
        System.out.println(bb);




        //-----------String-------------------------
        String param = "字符串";
        System.out.println(param);
        System.out.println(param.hashCode());


        param = param+":demo";
        System.out.println(param);
        System.out.println(param.hashCode());

        //------------StringBuilder-------------------------

        StringBuilder stringBuilder = new StringBuilder("StringBuilder初始值");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());

        stringBuilder.append("拼接值");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());

        //-------------StringBuffer-----------------------------------
        StringBuffer stringBuffer = new StringBuffer("StringBuffer初始值");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());

        stringBuffer.append("拼接值");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());




    }
}
