package com.company.stringblocks;

public class Main {

    public static void main(String[] args) {

        String description = "ejemplo1 \n" +
                "ejemplo1";
        System.out.println(description);

        String description2 = """
                ejemplo2
                ejemplo2
                """;
        System.out.println(description2);

        String html = """
                <a href="%s">%s<a/>
                """;
        System.out.println(String.format(html, "https://www.google.es", "Ir a Google"));
    }
}
