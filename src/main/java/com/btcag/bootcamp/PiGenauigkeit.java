package com.btcag.bootcamp;

import java.util.Scanner;

public class PiGenauigkeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen? ");
        int iteration = scanner.nextInt(); // Scanner Eingabe


        double pi = 0.0; //pi für annäherung auf 0 gesetzt
        int i = 0; // durchläufe bis zur Iterationsgrenze

        while (i < iteration) { // Hier wird sich angenähert bis zur Iterationsgrenze
            double leibnizReihe = 4.0 / (2 * i + 1); // Formel für Leibniz Reihe
            pi = pi + (1 - 2 * (i % 2)) * leibnizReihe; // (1-2*(i%2)) ist if/else Logik. Entweder kommt 1 oder -1 raus. Damit wird die Leibniz Reihe addiert oder subtrahiert von pi
            i++;
        }

        System.out.println("Nach " + iteration + " Iterationen wurde Pi auf den Wert " + pi + " berechnet");
    }
}