package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für die Primfaktorzerlegung eingeben (Long): ");

        long num = scanner.nextLong(); // Scanner Eingabe
        long num2 = num;
        long divider = 2;

        String factor = ""; // Leerer String
        boolean isPrim;

        while (divider <= num) {
            long result = num % divider; // Hier wird jede Zahl durch die Nummer geteilt bis sie true ist oder die Nummer erreicht ist

            isPrim = result == 0; // true, wenn kein rest entsteht

            while (isPrim) { //
                factor = factor + divider + " "; // Leerer String wird mit Zahl beschrieben
                num /= divider;
                isPrim = (num % divider ==0); // Hier wird geteilt und geguckt, ob ein rest entsteht
            }
            divider++;
        }
        System.out.println("Die Zahl " + num2 + " kann in folgende Faktoren zerlegt werden: " + factor);

    }
}
