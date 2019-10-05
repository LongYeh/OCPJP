package com.test.exception;

public class Question81 {
    public static void main(String[] args) {
        int num=10;
        int div=0;
        int ans;
        try{
             ans=num/div;
        }catch(ArithmeticException e){
            ans=0;
        }
        System.out.println(ans);
    }
}
