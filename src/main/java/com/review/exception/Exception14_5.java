package com.review.exception;

public class Exception14_5 {
    public static void main(String args[]){
        String[] test=new String [5];
        int t=100;
        for(int i=0;i<2;i++){

            test[i]=""+t;
            t++;
        }
        for(String i:test){
            System.out.println(i);
        }
        //超出陣列設定的範圍,ArrayIndexOutOfBoundsException
        try{
            for(int i=0;i<=test.length;i++){
            System.out.println(test[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("use try catch to avoid run stop!!!");
    }
}
