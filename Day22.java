
package day.pkg22;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Program Penghitungan Gaji Karyawan");

        // Masukkan jumlah gaji karyawan
        System.out.print("Masukkan gaji karyawan: ");
        double gaji = input.nextDouble();

        // Masukkan jumlah potongan
        System.out.print("Masukkan potongan (jika ada):  ");
        double potongan = input.nextDouble();

        // Menghitung gaji bersih
        double gajiBersih = gaji - potongan;

       
        System.out.println("Gaji karyawan: "  + gaji);
        System.out.println("Potongan:  " + potongan);
        System.out.println("Gaji bersih:  " + gajiBersih);

       
    }
}

    
    

