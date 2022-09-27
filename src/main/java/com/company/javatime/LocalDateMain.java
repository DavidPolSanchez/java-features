package com.company.javatime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

/*
Desde JDK 8 está java.time

LocalDate
LocalTime
LocalDateTime

Antes se trabaja con la clase Date
 */
public class LocalDateMain {

    public static void main(String[] args) {

        // crear fechas
        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        System.out.println(birthDate);

        LocalDate greatDate = LocalDate.ofYearDay(2022, 150);
        System.out.println(greatDate);

        LocalDate currentDate = LocalDate.now();

        // operaciones sobre las fechas
        currentDate.minusYears(1);
        LocalDate currentDateMinus1Month = currentDate.minusMonths(3);

        currentDate.plusYears(1);

        // info de una fecha
        int year = currentDate.getYear();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        int numDaysInCurrentMonth = currentDate.lengthOfMonth();
        int year2 = currentDate.get(ChronoField.YEAR);

    }
}
