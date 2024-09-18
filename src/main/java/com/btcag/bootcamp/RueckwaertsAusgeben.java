package com.btcag.bootcamp;


import java.util.Scanner;

public class RueckwaertsAusgeben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben(String):");

        String originalString = scanner.nextLine();
        int i = originalString.length() - 1;  // Starte beim letzten Zeichen

        while (i >= 0) {
            System.out.print(originalString.charAt(i));  // Gib das Zeichen an Position 'i' aus
            i--;  // Verringere den Index, um rückwärts zu gehen
        }
// -------------------------------------------------------------------------------------

        System.out.println("");  // Eine Leerzeile hinzufügen

// -------------------------------------------------------------------------------------

        System.out.println("Bitte Zahl eingeben (Long):");
        long originalLong = scanner.nextLong();
        long umgedrehtLong = 0;

        while (originalLong > 0) {
            umgedrehtLong = umgedrehtLong * 10 + originalLong % 10;  // % 10 extrahiert die letzte Ziffer der Zahl 'originalLong'
            originalLong = originalLong / 10;  // Entferne die letzte Ziffer von 'originalLong'
        }

        System.out.println(umgedrehtLong);

    }
}
//  01234 geht nicht da in Java keine führende 0 stehen darf