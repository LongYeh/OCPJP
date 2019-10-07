package com.review.multiThreading;

import java.util.Date;

public class Threading15_5 {
    public static void main(String args[]){
        Thread newThread=new Thread(new TimeThread());
        newThread.start();
        while(true){
            for(int i=0;i<100_000_000;i++);
            Date now=new Date();
            System.out.println(now);
        }

    }
}

class TimeThread1 implements Runnable{

    @Override
    public void run() {
        while(true){
            for(int i=0;i<100_000_000;i++);
            Date now=new Date();
            System.out.println(now);
        }
    }
}
