package com.test;

public class Question118 {
    public static void main(String[] args) {

    }
    interface Exportable{
        void export();
    }
    class Tool implements Exportable{
//        protected void export(){}實作方法須為public
        public void export(){

        }
    }
}
