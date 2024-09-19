package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIKunst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Groesse des Vierecks: ");
        int groesse = scanner.nextInt(); // Scanner Eingabe
        int i = 0;

        while (i < groesse) { // Hier werden die Reihen geschrieben
            int j = 0;

                while (j < groesse) { // Hier werden die Zeilen geschrieben.
                    System.out.print("* ");
                    j++; // j wird erhöht damit bei j = Eingabe gestoppt wird
                }
                System.out.println(); // Wenn die Zeile = Eingabe ist springt er raus und mach einen Absatz
                i++; // i wird erhöht damit bei i = Eingabe gestoppt wird

        }
// ------------------------------------------------------------------

        System.out.println(""); // Leerzeile

// ------------------------------------------------------------------

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Groesse des Dreiecks: ");
        int groesse1 = scanner1.nextInt(); // 2. Scanner Eingabe
        int a = 1;

        while (a <= groesse1) { // Sobald alle Sterne einer Zeiler fertig sind, wird eine neue Zeile angefangen
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
