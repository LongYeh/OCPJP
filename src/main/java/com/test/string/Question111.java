package com.test.string;

public class Question111 {
    public static void main(String[] args) {
        String myStr=" Hello World ";
        System.out.println(myStr);
        myStr.trim();//去掉String字串頭尾的" "空格
        System.out.println(myStr.trim());
        int i=myStr.indexOf(" ");
        System.out.println(i);
    }
}
