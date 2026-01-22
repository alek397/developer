package org.example;

import java.util.Scanner;

public class InputDariUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nama: ");
        String nama = input.nextLine();

        System.out.println("masukan umur: ");
        String umur = input.next();

        System.out.println("hallo " + nama + ", umur kamu " + umur);
    }
}
