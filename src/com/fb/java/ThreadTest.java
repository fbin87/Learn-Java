package com.fb.java;

public class ThreadTest {
    public static void main(String []args){
        Thread a=new MyThreadA();
        Thread b=new MyThreadB();
        b.start();
        a.start();
    }
}
class MyThreadA extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("A");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThreadB extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("B");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}