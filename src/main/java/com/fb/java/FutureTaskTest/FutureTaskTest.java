package com.fb.java.FutureTaskTest;

import java.util.concurrent.*;

public class FutureTaskTest {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        System.out.println("主线程开始");
        ExecutorService exct= Executors.newCachedThreadPool();
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        FutureTask<Integer> fta=new FutureTask<>(a);
        FutureTask<Integer> ftb=new FutureTask<>(b);

        exct.submit(fta);
        exct.submit(ftb);

        exct.shutdown();
        System.out.println(ftb.get());
        System.out.println(fta.get());


    }
}

