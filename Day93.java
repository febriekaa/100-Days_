package day.pkg93;

import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {
        String namaKapal = "Kapal Bahagia";
        int hargaTiket = 150000;
        int jumlahTiketTersedia = 100;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di " + namaKapal);
        System.out.println("Harga tiket: Rp " + hargaTiket);
        System.out.println("Tiket tersedia: " + jumlahTiketTersedia);

        System.out.print("Berapa tiket yang ingin Anda beli? ");
        int jumlahTiketDibeli = scanner.nextInt();

        
        if (jumlahTiketDibeli > 0 && jumlahTiketDibeli <= jumlahTiketTersedia) {
            int totalHarga = jumlahTiketDibeli * hargaTiket;
            System.out.println("Terima kasih telah membeli tiket.");
            System.out.println("Total Harga: Rp " + totalHarga);
            jumlahTiketTersedia -= jumlahTiketDibeli;
            System.out.println("Tiket tersedia sekarang: " + jumlahTiketTersedia);
        } else {
            System.out.println("Maaf, tiket tidak tersedia atau jumlah tiket tidak valid.");
        }

        // Menutup scanner
        scanner.close();
    }
}

    
