package com.test.extendsImplementAbtract;

public class Question121 {
    public static void main(String[] args) {
        C2 obj1=new C1();
        I obj2=new C1();
//        C2 s=obj2;需做資料型態轉換.
        C2 s=(C2)obj2;
//        I t=obj1;
        I t=(I)obj1;
    }
    static class C2{
        public void displayC2(){
            System.out.println("C2");
        }
    }
    interface I{
        public void displayI();
    }
    static class C1 extends C2 implements I{
        public void displayI(){
            System.out.println("C1");
        }
    }
}
