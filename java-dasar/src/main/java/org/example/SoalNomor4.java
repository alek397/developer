package org.example;

import java.util.Scanner;

/**
 🧪 LATIHAN LEVEL 4 – SOAL 1

 Buat program Java yang:

 1️⃣ Input nilai ujian
 2️⃣ Jika nilai ≥ 60 → tampilkan "LULUS"
 3️⃣ Jika nilai < 60 → tampilkan "TIDAK LULUS"

 📌 Contoh output:
    Masukkan nilai: 55
    TIDAK LULUS
 */

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai: ");
        int nilai1 = input.nextInt();

        if (nilai1 >= 60) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
