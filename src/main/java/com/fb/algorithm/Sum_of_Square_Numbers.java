package com.fb.algorithm;

public class Sum_of_Square_Numbers {
    public static void main(String[] args) {
        // write your code here
        System.out.println(function(14));
    }
    private static Boolean function(int a){
        int indexMin=0;
        int indexMax=a-1;
        while (indexMax>indexMin){
            int target=indexMax*indexMax+indexMin*indexMin;
            if(target>a){
                indexMax--;
            }else if(target<a){
                indexMin++;
            }else {
                return true;
            }
        }
        return false;
    }
}
