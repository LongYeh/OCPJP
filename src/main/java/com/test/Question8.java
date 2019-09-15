package com.test;

import java.io.IOException;

public class Question8 {
    public static void main(String[] args)throws IOException {
        X test=new X();
        test.printFileContent();
    }

    static class X{
        public void printFileContent() throws IOException {
            throw new IOException();
        }
    }
}
