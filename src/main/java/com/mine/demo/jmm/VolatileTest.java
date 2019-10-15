package com.mine.demo.jmm;

/**
 * @Description:
 * @Author: Jax.li
 * @Create: 2019-10-13 10:12
 */
public class VolatileTest {

    private static Boolean initFlag = false;

    public static void main( String[] args ) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" thread 1 has started...");
                while (!initFlag) {

                }
                System.out.println(" thread 1 has ended...");
            }
        }).start();

        Thread.sleep(500);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" thread 2 has started...");
                initFlag = true;
                System.out.println(" thread 2 has ended...");
            }
        }).start();
    }
}
