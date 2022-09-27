package com.company.switchexpr;

public class Main {

    public static void main(String[] args) {

        Account account = Account.BASIC;

        // switch tradicional
        switch (account) {
            case BASIC:
                System.out.println("cuenta basica");
                break;
            case SAVING:
                System.out.println("cuenta ahorro");
                break;
            case ENTERPRISE:
                System.out.println("cuenta empresas");
                break;
            default:
                throw new IllegalArgumentException("bad account type");
        }

        // switch expresión
        switch (account) {
            case BASIC -> System.out.println("cuenta básica");
            case SAVING -> System.out.println("cuenta ahorro");
            case ENTERPRISE -> { // si un caso tiene más de una línea se pueden crear bloques
                System.out.println("cuenta empresas");
                System.out.println("cuenta empresas");
            }
            default -> throw new IllegalArgumentException("bad account type");
        }


    }


}
enum Account { BASIC, SAVING, ENTERPRISE}

