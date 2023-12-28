package day.pkg81;

import java.util.Scanner;

public class Day81 {

    public static void main(String[] args) {
//      Buat program untuk menghitung biaya parkir berdasarkan durasi parkir
//      di tempat tertentu. Jika durasi lebih dari 2 jam, biaya adalah 10000 
//      per jam, jika tidak, biaya adalah 5000 per jam. 

      final int biaya_maksimal = 10000; // biaya per jam jika lebih dari 2 jam
      final int biaya_minimal = 5000;   // biaya per jam jika tidak lebih dari 2 jam
      final int durasi_maksimal = 2;    // durasi maksimal untuk bayaran


        Scanner sc = new Scanner (System.in);
        System.out.print("durasi parkir per jam : ");
        int durasi_parkir = sc.nextInt();

        int biayaParkir;

        if (durasi_parkir > biaya_maksimal) {
            biayaParkir = biaya_maksimal + ((durasi_parkir - durasi_maksimal) * biaya_maksimal);
        } else {
            biayaParkir = biaya_minimal * durasi_parkir;
        }

        System.out.println("Biaya parkir adalah: Rp " + biayaParkir);
    }
    
}
