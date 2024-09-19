package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIKunstII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Groesse einer Sanduhr healfte ");
        int groesse = scanner.nextInt(); // Scanner Eingabe

        int a = groesse;

        while (a > 0) { // Hier werden die Reihen geschrieben bis 1
            int b = 1;

            while (b <= a) { // Hier werden die Sterne geschrieben bis die Eingabe erreicht ist
                System.out.print("* ");
                b++;
            }

            System.out.println();
            a--; // Hier wird die Reihe um 1 verringert, damit ein Stern weniger ist
        }

        while (a <= groesse) { // Sobald alle Sterne einer Zeiler fertig sind, wird eine neue Zeile angefangen
            int b = 1;

            while (b <= a) { // Hier werden die Sterne für die Zeilen geschrieben
                System.out.print("* ");
                b++;
            }

            System.out.println();
            a++;
        }
    }
}
