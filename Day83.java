package day.pkg83;

import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Input data gaji bulanan dan bonus tahunan
        System.out.print("Masukkan gaji bulanan Anda (dalam juta): ");
        double gajiBulanan = scanner.nextDouble() * 1000000;

        System.out.print("Masukkan bonus tahunan Anda (dalam juta): ");
        double bonusTahunan = scanner.nextDouble() * 1000000;

        // Perhitungan penghasilan tahunan
        double penghasilanTahunan = (gajiBulanan * 12) + bonusTahunan;

        // Output hasil
        System.out.println("Penghasilan tahunan Anda adalah: " + penghasilanTahunan / 1000000 + " juta.");
    }
}

