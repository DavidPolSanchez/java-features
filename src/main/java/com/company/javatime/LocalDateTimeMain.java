package com.company.javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime deliveryDate = LocalDateTime.of(2022, 1, 1, 17, 30);

        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        LocalDateTime birthDateTime = birthDate.atTime(17, 40);

    }
}
