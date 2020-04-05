package com.fb.java.FutureTaskTest;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String []args) throws ExecutionException, InterruptedException {
        // Future 比 FutureTask 更加的简洁
        ExecutorService exct= Executors.newCachedThreadPool();
        ThreadA a=new ThreadA();
        ThreadB b =new ThreadB();
        Future<Integer>resultA=exct.submit(a);
        Future<Integer>resultB=exct.submit(b);
        exct.shutdown();

        System.out.println(resultA.get());
        System.out.println(resultB.get());
    }
}
