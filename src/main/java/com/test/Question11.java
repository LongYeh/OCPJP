package com.test;

public class Question11 {
    public static void main(String[] args) {
        Book book=new EBook();
        book.setBookMark();
    }

    interface Readable{
        public void readBook();
        public void setBookMark();
    }

    abstract static class Book implements Readable{
        public void readBook(){}
    }

    static class EBook extends Book {
        public void readBook(){}

        @Override
        public void setBookMark() {

        }
    }
}
