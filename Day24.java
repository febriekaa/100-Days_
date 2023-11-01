package day.pkg24;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        String musim;

        switch (nomorBulan) {
            case 10:
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
                musim = "Musim Hujan";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                musim = "Musim Kemarau";
                break;
         
            default:
                System.out.println("Anda memasukkan nomor bulan yang tidak valid. Masukkan nomor antara 1 hingga 12.");
                musim = "Bulan tidak valid";
                break;
                
        }

        System.out.println("Bulan ke-" + nomorBulan + " adalah " + musim);

    }
}

  
