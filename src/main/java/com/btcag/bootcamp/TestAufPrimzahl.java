package com.btcag.bootcamp;

import java.util.Scanner;

public class TestAufPrimzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl auf Primtest eingeben (Long): ");

        long imput = scanner.nextLong(); // Scanner Eingabe
        long imput2 = imput -1; // -1 von der Originalzahl zum teilen
        boolean isPrim = true;

        int tmp = 0;
        while (imput2 > 1) { // Hier wird durch jede kleinere Zahl geteilt und geguckt, ob ein Rest kommt
            long result = imput % imput2;
            isPrim = result > 0; // wenn ein Rest kommt, bleibt isPrim auf true

            while (isPrim==false) { // wenn kein Rest kommt, ist isPrim false
                tmp++; // Variable tmp wird um einen erhöht
                isPrim = true; // isPrim wird wieder auf true gesetzt
            }
            imput2--; // nun wird mit einer Zahl weniger geteilt
        }

        while (tmp > 0) { // Wenn wir mehrere teiler gefunden haben (tmp) dann ist es keine Primzahl
            isPrim = false;
            tmp = 0;
        }

        System.out.println("Ergebnis: " + isPrim);

    }
}
