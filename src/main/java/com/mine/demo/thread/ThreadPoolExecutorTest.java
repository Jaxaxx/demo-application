package com.mine.demo.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description:
 * @Author: Jax.li
 * @Create: 2019-10-31 15:44
 */
public class ThreadPoolExecutorTest {

    //    private ThreadLocal threadLocal = ThreadLocal.withInitial(() -> new ThreadPoolExecutor(10));
    private static ThreadLocal<ExecutorService> threadLocal = ThreadLocal.withInitial(()-> Executors.newFixedThreadPool(10) );


    public static void main( String[] args ) {
        ExecutorService executorService = threadLocal.get();

        for (int i = 0; i < 20; i++) {
            executorService.execute(()-> {
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
