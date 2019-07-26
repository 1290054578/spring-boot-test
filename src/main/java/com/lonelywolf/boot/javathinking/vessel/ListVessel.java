package com.lonelywolf.boot.javathinking.vessel;

import java.util.*;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-26 15:49
 * @Description:
 */
public class ListVessel {



    public static void main(String[] args) {
        //List写入读取顺序测试
        testListSort();

        //List写入，中间随机访问，删除修改耗时
        testListMoveModify();
    }

    public static void testListMoveModify(){
        List<Map<Object,String>> arrayList = new ArrayList<>();
        List linkedList = new LinkedList();
        List vector = new Vector();

        List list = write(arrayList);
        List list2 = write(linkedList);
        List list3 = write(vector);

        randomGet(list);
        randomGet(list2);
        randomGet(list3);

        randomModifyRemove(list);
        randomModifyRemove(list2);
        randomModifyRemove(list3);
    }


    /**
     * [List容器插入删除]
     * @author xiangyong.zeng
     * @param list
     * @return java.util.List
     * @date 2019-07-26 17:14
     */
    public static List randomModifyRemove(List list){
        long a = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i <100000 ; i++) {
            list.remove(random.nextInt(10000));
            list.set(random.nextInt(10000),i);
        }
        System.out.println(list.getClass()+"随机修改移除耗时："+ (System.currentTimeMillis() - a));
        return null;
    }


    /**
     * [List容器随机访问耗时]
     * @author xiangyong.zeng
     * @param list
     * @return java.util.List
     * @date 2019-07-26 16:18
     */
    public static List randomGet(List list){
        long a = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i <100000 ; i++) {
            list.get(random.nextInt((100000)));
        }

        System.out.println(list.getClass()+"随机访问耗时："+ (System.currentTimeMillis() - a));
        return list;
    }

    /**
     * [List容器写入耗时]
     * @author xiangyong.zeng
     * @param list
     * @return java.util.List
     * @date 2019-07-26 16:12
     */
    public static List write(List list){
        long a = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        System.out.println(list.getClass()+"写入耗时："+ (System.currentTimeMillis() - a));
        return list;
    }

    /**
     * [List容器写入，读取顺序]
     * @author xiangyong.zeng
     * @param
     * @return void
     * @date 2019-07-26 16:00
     */
    public static void testListSort(){
        List<Map<Object,String>> arrayList = new ArrayList<>();
        List linkedList = new LinkedList();
        List vector = new Vector();

        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            Map<Object,String> hashMap = new HashMap<>(1);
            hashMap.put(i,random.toString());

            arrayList.add(hashMap);
            linkedList.add(hashMap);
            vector.add(hashMap);
        }

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(vector);
    }

}
