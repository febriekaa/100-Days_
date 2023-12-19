package day.pkg72;

import java.util.Scanner;

public class Day72 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        // Menggunakan operator ternary untuk menentukan apakah angka genap atau ganjil
        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println("Angka " + angka + " adalah angka " + jenisAngka + ".");

        scanner.close();
    }
}

    
   
