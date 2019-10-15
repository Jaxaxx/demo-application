package com.mine.demo.jvm;

/**
 * @Description:
 * @Author: Jax.li
 * @Create: 2019-10-13 16:49
 */
class StackTest {

    public static final Integer CONSTANT = 1000;

    public Integer compute(){
        int a = 1;
        int b = 2;
        int c = (a + b)*10;
        return c ;
    }

    public static void main( String[] args ) {
        StackTest stackTest = new StackTest();
        stackTest.compute();
    }

}
