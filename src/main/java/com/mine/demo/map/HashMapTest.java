package com.mine.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {

    public static void main(String[] args) {
//        test1();
        test2();

        int hash = hash(1);
        System.out.println(hash);

    }

    /**
     * 存入顺序和取出顺序不一致：无序
     */
    static void test1() {
        Map<Integer, Integer> map = new HashMap<>();

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

    static void test2() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("name", "john");

        int index = Math.abs("name".hashCode()) % 16;

        System.out.println("name.hashCode:---->" + "name".hashCode());
        System.out.println("index:" + index);

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode())  ^  (h >> 16);
    }


}
