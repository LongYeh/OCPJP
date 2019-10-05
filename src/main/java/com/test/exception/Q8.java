package com.test.exception;

public class Q8 {
    public static void main(String[] args)  {
        Q8 test=new Q8();
        try{
            test.doPrint();
            test.doList();
//            test.doPrint();
        }catch(Exception e){
            System.out.println("Caught"+e);
        }
    }

    public static void doList()throws Exception{
        throw new Error("Error");
    }
    public static void doPrint()throws Exception{
        throw new RuntimeException("Exception");
    }
}
