package com.test.exception;

public class Question19 {
    public static void main(String[] args)  {
        Question19 test=new Question19();
        int i=12344;
//        test.readCard(i);
        test.checkCard(i);
    }

    void readCard(int carNo) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCard(int carNo)throws RuntimeException{
        System.out.println("Checking Card");
    }
}
