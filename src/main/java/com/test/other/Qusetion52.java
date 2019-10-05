package com.test.other;

public class Qusetion52 {
    public static void main(String[] args) {
        String[] strs=new String[2];
        int idx=0;
        for(int i=0;i<strs.length;i++){
            strs[i]=Integer.toString(i);
        }
        for(idx=0;idx<strs.length;idx++){
            System.out.println(strs[idx]);
        }
    }
}
