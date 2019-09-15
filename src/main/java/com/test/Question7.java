package com.test;

public class Question7 {
    public static void main(String[] args) {

    }

    class Vehicle{
        String type="4w";
        int maxSpeed=100;

        Vehicle(){}
        Vehicle(String type,int maxSpeed){
            this.type=type;
            this.maxSpeed=maxSpeed;
        }
    }

    class Car extends Vehicle{
        String trans;
        Car(String trans){
            //父類別無空建構子
            this.trans=trans;
        }
        Car(String type,int maxSpeed,String trans){
            super(type,maxSpeed);
            this.trans=trans;
            //super and this must in first statements,so cant both in;
//            this(trans);
        }
    }
}
