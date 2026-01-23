package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
     #soal#
     🎯 Latihan 2 (Penjumlahan)

     Buat program yang:

     Input 2 angka

     Output hasil penjumlahannya

     Contoh output:
     Masukkan angka 1: 10
     Masukkan angka 2: 5
     Hasil: 15

     Petunjuk (kamu boleh pakai ini)
     int angka1 = input.nextInt();
     int angka2 = input.nextInt();
     int hasil = angka1 + angka2;
     System.out.println("Hasil: " + hasil);
 */

public class SoalNomor2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka 1 - 10 = ");
        int angka1 = input.nextInt();

        System.out.print("Masukan angaka 2 - 5 = ");
        int angka2 = input.nextInt();

        int hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);
    }
}
