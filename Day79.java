package day.pkg79;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan luas tanah (Permeter): ");
        double luasTanah = sc.nextDouble();

        double hargaJualPerMeter = 300_000;

        double totalHargaJual = luasTanah * hargaJualPerMeter;

        double pajak = 0.0;
        if (totalHargaJual >= 100000000) {
            pajak = 0.05; 
        } else if (totalHargaJual >= 50000000) {
            pajak = 0.03;
        } else {
            pajak = 0.01;
        }

        double jumlahPajak = totalHargaJual * pajak;
        double uangBersih = totalHargaJual - jumlahPajak;
 
        System.out.println("Total Harga Jual: Rp " + totalHargaJual);
        System.out.println("Pajak yang Dikenakan: Rp " + jumlahPajak);
        System.out.println("Uang Bersih yang Didapatkan: Rp " + uangBersih);

        sc.close();
    }
}

    