package com.test;

public class Question9 {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.useElectricity(-100);
        c.setBill(-100);

    }

    public static class Customer extends ElectricAccount{
        public void useElectricity(double kWh){
            addkWh(kWh);
        }
    }

    public static class ElectricAccount {
        private double kWh;
        private double rate=0.07;
        private double bill;

        public void addkWh(double kWh){
            if(kWh>0){
                this.kWh+=kWh;
                setBill(this.kWh);
            }
        }
        //D選項 setBill方法  無法避免費用超出預期範圍
        public void setBill(double kWh){
            bill=kWh*rate;
            System.out.println(bill);
        }
    }
}
