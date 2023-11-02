package day.pkg25;

import java.util.Scanner;


public class Day25 {

  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng - Rp. 15000");
        System.out.println("2. Mie Goreng - Rp. 12000");
        System.out.println("3. Sate Ayam - Rp. 20000");
        System.out.println("4. Bakso - Rp. 18000");
        System.out.println("5. Gado-Gado - Rp. 10000");
        System.out.print("Pilih nomor makanan yang diinginkan (1-5): ");

        int pilihan = scanner.nextInt();
        
        int harga;
        String makanan;

        switch (pilihan) {
            case 1:
                makanan = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                makanan = "Mie Goreng";
                harga = 12000;
                break;
            case 3:
                makanan = "Sate Ayam";
                harga = 20000;
                break;
            case 4:
                makanan = "Bakso";
                harga = 18000;
                break;
            case 5:
                makanan = "Gado-Gado";
                harga = 10000;
                break;
            default:
                makanan = "Pilihan tidak valid";
                harga = 0;
                break;
        }

        if (harga != 0) {
            System.out.println("Anda memilih " + makanan + " seharga Rp. " + harga);
        } else {
            System.out.println(makanan);
        }

       
    }
}

 
