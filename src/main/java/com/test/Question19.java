package com.test;

public class Question19 {
    public static void main(String[] args)  {
        Question19 test=new Question19();
        int i=12344;
        test.checkCard(i);
//        test.readCard(i);
    }

    void readCard(int carNo) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCard(int carNo)throws RuntimeException{
        System.out.println("Checking Card");
    }
}
