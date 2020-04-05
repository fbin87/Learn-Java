package com.fb.algorithm;

public class TwoSum {
    public static void main(String[] args) {
        // write your code here
        int []a=new int[]{2, 7, 11, 15};
        int target=18;
        function(a,target);
    }
    private static void function(int []a,int target){
        //double pointer
        int indexMin=0;
        int indexMax=a.length-1;
        while (indexMin<indexMax){
            if(a[indexMin]+a[indexMax]>target){
                indexMax--;
            }else if(a[indexMin]+a[indexMax]<target){
                indexMin++;
            }else {
                System.out.printf("index1=%d,index2=%d\n",indexMin,indexMax);
                break;
            }
        }
    }
}
