package com.test.localdateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question115 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of(2014,7,31,1,1);
        System.out.println(dt.plusDays(30));
        //plus方法僅為複製體,初始日期並沒有改變.
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
