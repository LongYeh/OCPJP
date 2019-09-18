package com.test;

public class Question70 {
    public static void main(String[] args) {
        Integer x=new Integer("1");
//        Integer y=1;
//        Integer y=new Integer(1);
//        Integer y=new Integer(1.0);不合法,資料型態不相容.
        Double y=1.0;
//        Double y=1;不合法.
        Double a=new Double(1);
        Byte b=1;
    }
}
