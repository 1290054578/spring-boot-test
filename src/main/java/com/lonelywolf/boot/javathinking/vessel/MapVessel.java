package com.lonelywolf.boot.javathinking.vessel;

import org.apache.commons.lang3.time.DateUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static javafx.scene.input.KeyCode.T;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-26 09:56
 * @Description:  java map容器
 */
public class MapVessel {

    private static Integer forTimes = 10000000;
    private static Integer readTimes = 10000000;

    /***
     * Map 集合类用于存储元素对（称作“键”和“值”），其中每个键映射到一个值。
     * 实现的子类：AbstractMap ， Attributes  ， EnumMap ， HashMap， Hashtable ， LinkedHashMap ，Properties ， Provider ，TreeMap  ， WeakHashMap
     *
     *
     */


    public static void main(String[] args) {
    /***
        //方法单独执行，多次测试耗时比较
        treeMap();

        hashmap();

        linkedHashMap();

        hashTable();

        concurrentHashMap();*/

        //Map衍生容器写入顺序测试
        testSort();

    }


    public static void testSort(){
        Random random = new Random();

        HashMap<Object,Object> hashMap = new HashMap<>(20);
        LinkedHashMap<Object,Object> linkedHashMap = new LinkedHashMap<>();
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        TreeMap<Object,Object> treeMap = new TreeMap<>();
        ConcurrentHashMap<Object,Object> concurrentHashMap = new ConcurrentHashMap<>();

        for (int i = 0; i < 20 ; i++) {
            int c = random.nextInt(100);
            hashMap.put(c,i);
            linkedHashMap.put(c,i);
            hashtable.put(c,i);
            treeMap.put(c,i);
            concurrentHashMap.put(c,i);
        }

        System.out.println("hashMap"+hashMap);
        System.out.println("linkedHashMap"+linkedHashMap);
        System.out.println("hashtable"+hashtable);
        System.out.println("treeMap"+treeMap);
        System.out.println("concurrentHashMap"+concurrentHashMap);

    }







    public static void hashmap(){
        long dateOne = System.currentTimeMillis();

        //HashMap设置初始大小，当初始数组满足使用时，则HashMap不需要再进行扩容，减少或避免rehash次数  注：初始大小为非必须参数
        HashMap<Object,Object> hashMap = new HashMap<>(1000000);
        for (int i = 0; i < forTimes ; i++) {
            hashMap.put(i,i);
        }

        long dateTwo = System.currentTimeMillis();

        System.out.println("HashMap,指定初始化容器大小put使用时间："+(dateTwo-dateOne));

        long dateThree = System.currentTimeMillis();

        for (int i = 0; i <forTimes ; i++) {
            hashMap.get(i);
        }

        long dateFour = System.currentTimeMillis();
        System.out.println("HashMap,指定初始化容器大小get使用时间："+(dateFour-dateThree));


        long datefive = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < readTimes ; i++) {
            hashMap.get(random.nextInt(readTimes));
        }
        long datesix = System.currentTimeMillis();

        System.out.println("HashMap,指定初始化容器大小,随机取值使用时间："+(datesix-datefive));

        hashMap.clear();
    }

    public static void linkedHashMap(){
        long dateOne = System.currentTimeMillis();

        LinkedHashMap<Object,Object> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < forTimes ; i++) {
            linkedHashMap.put(i,i);
        }

        long dateTwo = System.currentTimeMillis();


        System.out.println("linkedHashMap,put使用时间："+(dateTwo-dateOne));

        long dateThree = System.currentTimeMillis();

        for (int i = 0; i <forTimes ; i++) {
            linkedHashMap.get(i);
        }

        long dateFour = System.currentTimeMillis();
        System.out.println("linkedHashMap,get使用时间："+(dateFour-dateThree));

        long datefive = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < readTimes ; i++) {
            linkedHashMap.get(random.nextInt(readTimes));
        }
        long datesix = System.currentTimeMillis();

        System.out.println("linkedHashMap,随机取值使用时间："+(datesix-datefive));

        linkedHashMap.clear();
    }

    public static void hashTable(){
        long dateOne = System.currentTimeMillis();
        Hashtable<Object, Object> hashtable = new Hashtable<>();

        for (int i = 0; i < forTimes ; i++) {
            hashtable.put(i,i);
        }

        long dateTwo = System.currentTimeMillis();

        System.out.println("hashtable,put使用时间："+(dateTwo-dateOne));


        long dateThree = System.currentTimeMillis();

        for (int i = 0; i <forTimes ; i++) {
            hashtable.get(i);
        }

        long dateFour = System.currentTimeMillis();
        System.out.println("hashtable,get使用时间："+(dateFour-dateThree));

        long datefive = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < readTimes ; i++) {
            hashtable.get(random.nextInt(readTimes));
        }
        long datesix = System.currentTimeMillis();

        System.out.println("hashtable,随机取值使用时间："+(datesix-datefive));


        hashtable.clear();
    }

    public static void treeMap(){
        long dateOne = System.currentTimeMillis();

        //HashMap设置初始大小，当初始数组满足使用时，则HashMap不需要再进行扩容，减少或避免rehash次数  注：初始大小为非必须参数
        TreeMap<Object,Object> treeMap = new TreeMap<>();
        for (int i = 0; i < forTimes ; i++) {
            treeMap.put(i,i);
        }

        long dateTwo = System.currentTimeMillis();

        System.out.println("treeMap,put使用时间："+(dateTwo-dateOne));

        long dateThree = System.currentTimeMillis();

        for (int i = 0; i <forTimes ; i++) {
            treeMap.get(i);
        }

        long dateFour = System.currentTimeMillis();
        System.out.println("treeMap,get使用时间："+(dateFour-dateThree));

        long datefive = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < readTimes ; i++) {
            treeMap.get(random.nextInt(readTimes));
        }
        long datesix = System.currentTimeMillis();

        System.out.println("treeMap,随机取值使用时间："+(datesix-datefive));



        treeMap.clear();
    }

    public static void concurrentHashMap(){
        long dateOne = System.currentTimeMillis();

        ConcurrentHashMap<Object,Object> concurrentHashMap = new ConcurrentHashMap<>();
        for (int i = 0; i < forTimes ; i++) {
            concurrentHashMap.put(i,i);
        }

        long dateTwo = System.currentTimeMillis();

        System.out.println("concurrentHashMap,put使用时间："+(dateTwo-dateOne));

        long dateThree = System.currentTimeMillis();

        for (int i = 0; i <forTimes ; i++) {
            concurrentHashMap.get(i);
        }

        long dateFour = System.currentTimeMillis();
        System.out.println("concurrentHashMap,get使用时间："+(dateFour-dateThree));


        long datefive = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < readTimes ; i++) {
            concurrentHashMap.get(random.nextInt(readTimes));
        }
        long datesix = System.currentTimeMillis();

        System.out.println("concurrentHashMap,随机取值使用时间："+(datesix-datefive));

        concurrentHashMap.clear();
    }
}
