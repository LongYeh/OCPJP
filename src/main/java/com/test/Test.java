package com.test;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
//        CheckingAccount test=new CheckingAccount(100);
//        test.getAccount();
        Test t=new Test();
        try{
            t.doPrint();
            t.doList();
        }catch (Exception e2){
            System.out.println("Caught "+e2);
        }
        System.out.println(LocalTime.now());
        System.out.println(22.00f%3.00f);
        int arr[]={1,2,3};
        for(int var:arr){
            int i=1;
            while(i<=var)
                System.out.println(i++);
        }
    }

    public void doList()throws Exception{
    throw new Error("Error");
    }
    public void doPrint()throws Exception{
    throw new RuntimeException("Exception");
    }
}
