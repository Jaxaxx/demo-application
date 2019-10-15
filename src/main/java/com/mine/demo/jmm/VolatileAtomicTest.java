package com.mine.demo.jmm;

/**
 * @Description:
 * @Author: Jax.li
 * @Create: 2019-10-13 12:22
 */
public class VolatileAtomicTest {

    private static volatile Integer num = 0;

    public static void main( String[] args ) throws InterruptedException {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        num++;
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    num ++ ;
                }
            }).start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println(num);

    }


}
