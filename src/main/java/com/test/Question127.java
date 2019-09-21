package com.test;

public class Question127 {
    public static void main(String[] args) {

    }

    interface Downloadable{
        public void download();
    }
    interface Readable extends Downloadable{
        public void readBook();
    }
    abstract class Book implements Readable{
        public void readBook(){
            System.out.println("Read Book");
        }
    }
    class Ebook extends Book{

        @Override
        public void download() {

        }
    }
}
