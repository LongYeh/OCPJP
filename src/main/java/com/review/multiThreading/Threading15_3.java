package com.review.multiThreading;

import java.util.Date;

public class Threading15_3 {
    public static void main(String args[]){
        TimeThread newThread=new TimeThread();
        newThread.start();
        while(true){
            for(int i=0;i<50_000_000;i++);
                Date now = new Date();
                System.out.println("old: " + now);
        }
    }
}

class TimeThread extends Thread{
    public void run(){
        while(true){
            for(int i=0;i<50_000_000;i++);
                Date now = new Date();
                System.out.println(now);
        }
    }
}
