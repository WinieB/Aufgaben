package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        // Long
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (Long):");
        long originalLong = scanner.nextLong();
        long querLong = 0;

        while (originalLong > 0) {
            querLong = querLong + (originalLong % 10);
            originalLong = originalLong / 10;
        }
        System.out.println("Die Quersumme ist: " + querLong);

 // --------------------------------------------------------------------

        System.out.println("");

 // --------------------------------------------------------------------

        // String
        System.out.println("Bitte Zahl eingeben (String):");
        String originalString = scanner.nextLine();
        int querString = 0;
        int i = 0;

        while (i < originalString.length()) {
            char zeichen = originalString.charAt(i);
            querString = querString + (zeichen - '0');
        }
        i++;

        System.out.println("Die Quersumme ist: " + querString);

    }
}