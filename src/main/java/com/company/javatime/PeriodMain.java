package com.company.javatime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {

        LocalDate initDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 4, 5);

        Period elapsed = Period.between(initDate, endDate);
        System.out.println(elapsed.getDays());
        System.out.println(elapsed.getMonths());
        System.out.println(elapsed.getYears());
        System.out.println(elapsed.toTotalMonths());
    }
}
