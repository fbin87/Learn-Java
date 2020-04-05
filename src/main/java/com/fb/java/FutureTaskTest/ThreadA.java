package com.fb.java.FutureTaskTest;

import java.util.concurrent.Callable;

public class ThreadA implements Callable<Integer> {
    @Override
    public Integer call() throws InterruptedException {
        System.out.println("线程A在计算");
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=i;
        }
        Thread.sleep(500);
        System.out.println("线程A计算完成");
        return sum;
    }
}
