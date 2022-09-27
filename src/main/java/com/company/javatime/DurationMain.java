package com.company.javatime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationMain {

    public static void main(String[] args) {

        LocalDateTime initDate = LocalDateTime.of(2022, 1, 1, 17, 30);
        LocalDateTime endDate = LocalDateTime.of(2022, 1, 5, 17, 30);

        Duration elapsed = Duration.between(initDate, endDate);
        System.out.println(elapsed.toDays());


    }
}
