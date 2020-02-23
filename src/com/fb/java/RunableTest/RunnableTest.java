package com.fb.java.RunableTest;

public class RunnableTest {
    public static void main(String[] args) {
        // write your code here
        Thread a=new Thread(new ThreadA());
        Thread b=new Thread(new ThreadB());
        a.start();
        b.start();
    }
}


