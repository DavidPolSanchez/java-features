package com.company.javatime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

    public static void main(String[] args) {
        Date date = new Date(2022, 1, 1);

        Date date2 = new GregorianCalendar(2022, Calendar.JANUARY, 11).getTime();
        System.out.println(date2);
    }
}
