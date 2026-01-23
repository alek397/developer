package org.example;

import java.util.Scanner;

/**
     ✅ Latihan 1 (Paling Dasar)

     Buat program Java yang:

     Menyimpan nama kamu ke variabel String nama

     Menyimpan umur kamu ke variabel int umur

     Menampilkan output:

     Nama saya: <nama>
     Umur saya: <umur>

     Contoh output kalau namanya Andi, umur 20:
     Nama saya: Andi
     Umur saya: 20
*/

public class SoalNomor1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama saya: ");
        String nama = input.nextLine();

        System.out.print("Umur saya: ");
        int umur = input.nextInt();

        System.out.print("Nama saya: " + nama + " Umur saya: " + umur);

    }
}
