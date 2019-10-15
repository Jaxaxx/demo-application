package com.mine.demo.map;


import java.util.*;

public class TreeMapTest {

    public static void main(String[] args) throws InterruptedException {

        Map<Object, Object> map = new TreeMap<>();

        map.put(1, UUID.randomUUID().toString());
        map.put(65, UUID.randomUUID().toString());
        map.put(3, UUID.randomUUID().toString());
        map.put(5, UUID.randomUUID().toString());
        map.put(4, UUID.randomUUID().toString());


        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

        System.out.println("---------------------------");

//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            Integer aLong = iterator.next();
//            System.out.println(aLong + " : " + map.get(aLong));
//        }




    }
}
