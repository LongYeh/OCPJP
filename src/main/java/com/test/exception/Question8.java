package com.test.exception;

import java.io.IOException;

public class Question8 {
    public static void main(String[] args)throws IOException {
        X test=new X();
        try {
            test.printFileContent();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static class X{
        public void printFileContent() throws IOException {
            throw new IOException();
        }
    }
}
