package org.example;

import javax.net.ssl.SNIServerName;
import java.util.Scanner;

/**
 🔥 Sekarang kita lanjut ke Soal 2 (lebih menantang)
 🎯 LATIHAN LEVEL 4 – SOAL 2

 Buat program yang:

 Input nilai

 Tampilkan grade:

 Nilai	Grade
 ≥ 85	A
 ≥ 70	B
 ≥ 60	C
 < 60	D
 < 0 dan >100 invalid
 Contoh:
 Masukkan nilai: 88
 Grade: A
 */

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nilai: ");
        int nilai = input.nextInt();

        //validasi if else nilai
        if (nilai < 0 || nilai > 100) {
            System.out.println("Invalid");
        } else if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        input.close();
    }
}
