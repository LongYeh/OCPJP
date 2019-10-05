package com.test.localdateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question3 {
    public static void main(String[] args) {
        String date= null;
        date = LocalDateTime.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
