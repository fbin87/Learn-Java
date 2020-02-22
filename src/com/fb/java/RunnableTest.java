package com.fb.java;

public class RunnableTest {
    public static void main(String[] args) {
        // write your code here
        Thread a=new Thread(new ThreadA());
        Thread b=new Thread(new ThreadB());
        a.start();b.start();
    }
}
class ThreadA implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadB implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
