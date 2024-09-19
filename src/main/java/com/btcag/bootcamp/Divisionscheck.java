package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcher Divisor soll geprueft werden?");
        int divisor = scanner.nextInt(); // erste Scanner Eingabe

        System.out.println("Bis zu welcher Zahl?");
        int zahl = scanner.nextInt(); // zweite Scanner Eingabe

        int i = divisor;

        System.out.println(0); // Damit die erste 0 immer vorhanden ist

        while (i <= zahl) { // Hier wird von dem Divisor bis zur Zahl hochgerechnet (Also Zahl = 30 -> 7, 7+7, 7+7+7 ... <30)
            System.out.println(i);
            i += divisor;
        }
    }
}
