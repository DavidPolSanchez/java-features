package com.company.javatime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatterMain {

    public static void main(String[] args) {

        // pasar de fecha a texto:

        String pattern = "dd/MM/YYYY";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDate now = LocalDate.now();
        System.out.println(now); // YYYY-MM-dd

        String formattedNow = now.format(formatter);
        System.out.println(formattedNow); // dd/MM/YYYY

        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_ORDINAL_DATE));


        // pasar de texto a fecha

        String normalDate = "2022-08-17";
        LocalDate normalLocalDate = LocalDate.parse(normalDate);
        System.out.println(normalLocalDate);


        String anotherDate = "17-Aug-2022";
        DateTimeFormatter anotherFormatter = DateTimeFormatter.ofPattern("d-MMM-yyyy", Locale.US);
        LocalDate anotherLocalDate = LocalDate.parse(anotherDate, anotherFormatter);
        System.out.println(anotherLocalDate);

        String spanishDate = "17/08/2022";
        DateTimeFormatter spanishFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "ES"));
        LocalDate spanishLocalDate = LocalDate.parse(spanishDate, spanishFormatter);
        System.out.println(spanishLocalDate);

        ZoneId zoneId = ZoneId.of("Europe/Madrid");
        ZonedDateTime spanishDateTime = ZonedDateTime.now(zoneId);
        System.out.println(spanishDateTime);

    }
}
