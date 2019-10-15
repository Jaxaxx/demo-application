package com.mine.demo.map;

import java.util.LinkedHashMap;

/**
 * 存入顺序和取出顺序一致：有序
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        map.put(11, 1);
        map.put(65, 2);
        map.put(31, 3);
        map.put(15, 4);
        map.put(14, 5);
        map.put(22, 6);
        map.put(10, 7);
        map.put(16, 8);

        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

    }
}
