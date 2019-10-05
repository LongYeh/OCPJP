package com.test.string;

public class Question54 {
    public static void main(String[] args) {
        System.out.println("Hello"+new StringBuilder("Java SE 8"));
        System.out.println("Hello"+new MyString("Java SE 8"));
    }

    static class MyString{
        String msg;
        MyString(String msg){
            this.msg=msg;
        }
    }
}
