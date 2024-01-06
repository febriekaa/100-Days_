package day.pkg90;

import java.util.Scanner;

public class Day90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();

        int hasilPenjumlahan = angka1 + angka2;

        if (hasilPenjumlahan % 2 == 0) {
            hasilPenjumlahan += 1;
        } else {
            hasilPenjumlahan += 2;
        }

        System.out.println("Hasil penjumlahan dengan ketentuan: " + hasilPenjumlahan);
    }
}

   