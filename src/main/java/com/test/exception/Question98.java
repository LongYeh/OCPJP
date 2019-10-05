package com.test.exception;

import java.io.IOException;

public class Question98 {
    public static void main(String[] args) {
        X obj=new X();
        try{
        obj.printFileContent();
        }
//        catch (Exception K){ }Exception 是IOException的superclass因此若例外發生Exception已經抓到.
        catch (IOException c){
            System.out.println(c);
        }

    }
}
class X{
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}
