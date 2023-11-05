package day.pkg27;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kategori barang yang anda inginkan (makanan/pakaian/elektronik): ");
        String kategori = scanner.nextLine();

        switch (kategori) {
            case "makanan":
                System.out.println("Saran: Coba cari diskon untuk makanan dalam aplikasi pengiriman makanan.");
                break;
            case "pakaian":
                System.out.println("Saran: Periksa penawaran di toko pakaian online.");
                break;
            case "elektronik":
                System.out.println("Saran: Cek ulasan dan bandingkan harga sebelum membeli perangkat elektronik.");
                break;
            default:
                System.out.println("Maaf, saran untuk kategori barang tersebut tidak tersedia.");
                break;
        }        
    }
}

 
