package com.btcag.bootcamp;

import java.util.Scanner;

public class FibonacciZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        int n = scanner.nextInt(); // Scanner Eingabe

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci-Zahlen bis " + n + ":");
        System.out.print("0 "); // Damit die erste 0 immer da ist

        while (b <= n) { // Hier wird zusammengerechnet
            System.out.print(b + " "); // Ausgabe für die Zahl
           int temp = b; // b wird sich temporär gemerkt
           b = a + b; // b und a wird zusammen gerechnet für "neues" b
           a = temp; // temporäres b ist jetzt a

        }
    }
}
