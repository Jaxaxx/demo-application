package com.mine.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 存入顺序和取出顺序不一致：无序
 */
public class HashMapTest {

    public static void main(String[] args) throws InterruptedException {

        Map<Long, Object> map = new HashMap<>();

        for (int j = 0; j < 10; j++) {
            map.put(System.currentTimeMillis(), UUID.randomUUID());
            Thread.sleep(10);
        }

        map.forEach((k,v) -> {
            System.out.println(k + " : " + v);
        });
    }
}
