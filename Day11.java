package day.pkg11;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
       //menghitung cicilan bulanan tanpa bunga
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah pinjaman: ");
        double jumlahPinjaman = input.nextDouble();

       
        System.out.print("Masukkan jangka waktu pinjaman: ");
        int jangkaWaktuPinjaman = input.nextInt();

        double cicilanBulanan = jumlahPinjaman / jangkaWaktuPinjaman;

       
        System.out.println("Jumlah Pinjaman: " + jumlahPinjaman);
        System.out.println("Jangka Waktu Pinjaman: " + jangkaWaktuPinjaman + " bulan");
        System.out.println("Cicilan Bulanan: " + cicilanBulanan);

    }
}

    
    

