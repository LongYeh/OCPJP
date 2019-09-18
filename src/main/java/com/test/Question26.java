package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question26 {

    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        names.remove("Bran");

        System.out.println(names);
    }
}
