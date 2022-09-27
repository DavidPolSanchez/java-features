package com.company.javatime;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {

        LocalTime entryTime = LocalTime.of(10, 30);
        System.out.println(entryTime);

        entryTime.minusMinutes(30);

        entryTime.plusMinutes(5);
        entryTime.plusMinutes(5);
        entryTime.plusMinutes(5);
        entryTime.plusMinutes(5);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

    }
}
