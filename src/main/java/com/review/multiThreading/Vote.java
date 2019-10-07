package com.review.multiThreading;

public class Vote {
    private int total=0;
    private int numOfStations=2;
    private PollingStation[] stations;

    public synchronized void reportCount(String name,int count){
        int temp=total;
        System.out.println(name+"get"+count+"ticket");
        temp=temp+count;
        System.out.println("total: "+temp);
        total=temp;
    }

    public void starReport(){
        stations=new PollingStation[numOfStations];

        for(int i=1;i<=numOfStations;i++){
            stations[i-1]=new PollingStation(this,i+"number");
        }

        for(int i=0;i<numOfStations;i++){
            stations[i].start();
        }

        for(int i=0;i<numOfStations;i++){
            try{
                stations[i].join();
            }catch(InterruptedException e){}
        }

        System.out.println("final: ");

        for(int i=0;i<numOfStations;i++){
            System.out.println(stations[i].name+":"+stations[i].total);
        }
        System.out.println("total: "+total);
    }
    public static void main(String args[]){
        Vote v=new Vote();
        v.starReport();
    }
}
class PollingStation extends Thread{
    static int reportTimes=5;
    int total=0;
    Vote v;
    String name;

    public PollingStation(Vote v,String name){
        this.v=v;
        this.name=name;
    }

    public void run(){
        for(int i=0;i<reportTimes;i++){
            int count=(int)(Math.random()*500);
            v.reportCount(name,count);
            total+=count;
        }
    }
}
