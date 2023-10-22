package day.pkg14;

import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
    //     Menghitung hara diskon barang
        Scanner input = new Scanner(System.in);

        // Masukkan harga barang
        System.out.print("Masukkan harga barang: ");
        double HargaBarang = input.nextDouble();

        // Masukkan persentase diskon
        System.out.print("Masukkan persentase diskon : ");
        double PersentaseDiskon = input.nextDouble();

        // Hitung jumlah diskon
        double Diskon = (PersentaseDiskon / 100) * HargaBarang;

        // Hitung harga setelah diskon
        double HargaSetelahDiskon = HargaBarang - Diskon;

        // Hasil
        System.out.println("Harga setelah diskon: " + HargaSetelahDiskon);

        
    }
}

    
    
