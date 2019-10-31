package com.mine.demo.map;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 默认会按照key排序吗，由小到大
 */
public class TreeMapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

//        map.put(11, 1);
//        map.put(65, 2);
//        map.put(31, 3);
//        map.put(15, 4);
//        map.put(14, 5);
//        map.put(22, 6);
//        map.put(10, 7);
//        map.put(16, 8);

        map.put("a", 1);
        map.put("b", 2);
        map.put("g", 3);
        map.put("f", 4);
        map.put("d", 5);
        map.put("cc", 6);

        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

    }
}
