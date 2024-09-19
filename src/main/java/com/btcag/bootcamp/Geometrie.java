package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine ganze Zahl größer als 0 ein:");
        int radius = scanner.nextInt(); // Scanner Eingabe für Radius

        double flaecheKreis = 3.14 * radius * radius; // Berechnung des Fläscheninhalts

        System.out.println("Der Flächeninhalt der Kreises beträgt: " + flaecheKreis);

 // ------------------------------------------------------------------------------

        System.out.println("");

 // ------------------------------------------------------------------------------

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte gib die Länge für dein Rechteck ein: ");
        int laenge = scanner2.nextInt(); // Scanner Eingabe für die Länge
        System.out.println("Bitte gib die Breite für dein Rechteck ein: ");
        int breite = scanner2.nextInt(); // Scanner Eingabe für die Breite

        int flaecheRecht = laenge * breite; // Berechnung des Flächeninhaltes

        System.out.println("Der Flächeninhalt der Kreises beträgt: " + flaecheRecht);
    }

}
