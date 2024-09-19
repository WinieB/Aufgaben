package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        // Long
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (Long):");
        long originalLong = scanner.nextLong(); // erste Scanner Eingabe
        long querLong = 0;

        while (originalLong > 0) {
            querLong = querLong + (originalLong % 10); // addiert die letzte Zahl zur Quersumme
            originalLong = originalLong / 10; // entfernt die letzte Zahl
        }
        System.out.println("Die Quersumme ist: " + querLong);

 // --------------------------------------------------------------------

        System.out.println("");

 // --------------------------------------------------------------------

        // String
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (String):");
        String originalString = scanner2.nextLine();
        int querString = 0; // zweite Scanner Eingabe
        int i = 0;

        while (i < originalString.length()) {
            char zeichen = originalString.charAt(i); // das Zeichen an Stelle i wird extrahiert und
            querString = querString + (zeichen - '0'); // mit -0 wird die Ziffer zu einer Zahl und dann in querString geschrieben
            i++;
        }


        System.out.println("Die Quersumme ist: " + querString);

    }
}