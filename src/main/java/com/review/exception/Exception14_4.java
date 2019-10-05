package com.review.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception14_4 {
    public static void main(String args[])throws IOException {
        System.out.println("要畫多高的*號三角形(行):");
        System.out.print("->");

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=bf.readLine();
        int line=Integer.parseInt(str);

        for(int i=1;i<=line;i++){
            for(int j=1;j<=line-1;j++)
                System.out.print("\t");
            for(int k=1;k<2*i;k++)
                System.out.print("*");
            System.out.println("\n");
        }

    }
}
