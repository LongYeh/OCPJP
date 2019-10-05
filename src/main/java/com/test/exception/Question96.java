package com.test.exception;

public class Question96 {
    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();
        b1=(A)b2;
        //ClassCastException
        A b3=(B)b2;
        b1.test();
        b3.test();
    }
}

class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
// class C extends A{}同為繼承A,即使是兄弟但無直接繼承關係,互相轉換會造成例外的發生
class C extends B{
    public void test(){
        System.out.println("C");
    }
}
