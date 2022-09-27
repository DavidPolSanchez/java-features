package com.company.inferencetypes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String nombre = "Alan";
        System.out.println(nombre);

        var apellido = "Sastre";
        System.out.println(apellido);

        List<String> nombres = new ArrayList<>();

        var dnis = new ArrayList<String>();

        // IMPORTANTE: aquellos casos en los que no está el tipo a la vista lo
        // mejor es no utilizar var para poder ver claramente qué tipo es
        // Por ejemplo: llamadas a métodos, resultados de operaciones con Stream
        // Customer result = llamadaMetodo();

        // IMPORTANTE: mantener balance con las prácticas de nombrado de clean code
    }
}
