package com.review.exception;

import java.util.Scanner;

public class Exception14_29 {
    public static void main(String args[]){
        System.out.println("大小寫互換");
        System.out.println("input String what you want to change(input bye its end): ");

        Scanner sc= new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            if(str.equalsIgnoreCase("bye"))
                break;
            char[] ch=str.toCharArray();

            try{
                for(int i=0;i<ch.length;i++){
                    if(Character.isLetter(ch[i])||Character.isWhitespace(ch[i]))
                        if(Character.isLowerCase(ch[i]))
                            ch[i]=Character.toUpperCase(ch[i]);
                        else
                            ch[i]=Character.toLowerCase(ch[i]);
                        else
                            throw new Exception();
                }

                    System.out.println(ch);


            }catch(Exception e){
                System.out.println(e);
                System.out.println("just English character !");
            }
            finally {
                System.out.println("\ninput String you want to change:(input bye run stop) ");
            }
        }
    }
}
