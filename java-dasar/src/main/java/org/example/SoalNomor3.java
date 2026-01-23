package org.example;

import java.util.Scanner;

/**
    🎯 Latihan berikutnya (Level 3)

    Buat program yang menghitung rata-rata dari 3 angka

    Contoh output:

    Masukan angka 1: 10
    Masukan angka 2: 20
    Masukan angka 3: 30
    Rata-rata: 20
*/

public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka 1 - 10 = ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka 2 - 20 = ");
        int angka2 = input.nextInt();
        System.out.print("Masukan angka 3 - 30 = ");
        int angka3 = input.nextInt();

        int average = (angka1 + angka2 + angka3) / 3;
        System.out.println("Rata - rata = " + average);
    }
}
