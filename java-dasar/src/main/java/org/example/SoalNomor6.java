package org.example;

import java.util.Scanner;

/**
 ✍️ TUGAS LEVEL 5 – SOAL 1

 Buat program Java yang:

 Input nilai

 Panggil method bernama:

 hitungGrade


 Method tersebut:

 Menerima parameter int nilai

 Mengembalikan (return) String grade

 Aturan sama:

 Invalid

 A / B / C / D

 main hanya menampilkan hasil
 */

public class SoalNomor6 {

    public static String hitungGrade(int nilai) {
        if (nilai < 0 || nilai > 100) {
            return("invalid");
        } else if (nilai >= 85) {
            return("A");
        } else if (nilai >= 70) {
            return("B");
        } else if (nilai >= 60) {
            return ("C");
        } else {
            return ("D");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        int nilai = input.nextInt();

        //memanggil method
        String grade = hitungGrade(nilai);

        System.out.print("grade: " + grade);

        input.close();
    }
}

/**
 * conto serupa
 * public class ContohMethod {
 *
 *     public static String hitungGrade(int nilai) {
 *         return "A";
 *     }
 *
 *     public static boolean nilaiValid(int nilai) {
 *         return nilai >= 0 && nilai <= 100;
 *     }
 *
 *     public static void tampilkanHasil(String grade) {
 *         System.out.println("Grade: " + grade);
 *     }
 *
 *     public static void main(String[] args) {
 *         int nilai = 85;
 *
 *         if (nilaiValid(nilai)) {
 *             String grade = hitungGrade(nilai);
 *             tampilkanHasil(grade);
 *         }
 *     }
 * }
 */