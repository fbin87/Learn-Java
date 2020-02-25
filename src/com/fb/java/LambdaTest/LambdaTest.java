package com.fb.java.LambdaTest;

import java.util.concurrent.TransferQueue;

public class LambdaTest {
    public static void main(String args[]){
        People p=new People(165,200);

        //general,匿名类
        Check check=new Check() {
            @Override
            public boolean check(People p) {
                return p.getHeight()>170&&p.weight<150;
            }
        };
        System.out.println(filter(p,check));

        //lambda，匿名方法
        System.out.println(filter(p, h->h.getHeight()>170&&h.weight<150));

    }

    static int filter(People p,Check c){
        if(c.check(p)){
            return 1;
        }else
            return 0;
    }
}
