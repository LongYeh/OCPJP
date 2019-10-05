package com.test.other;

public class Q20 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        for(int var:arr){
            int i=1;
            //while條件成立 不做事,也無增減值,形成無限迴圈.
            while(i<=var);
                System.out.println(i++);
        }
       /* for(int var=0;var<arr.length;var++)
        {
            int i=1;
                while (i<=var);
            System.out.println(i++);
        }*/
    }
}
