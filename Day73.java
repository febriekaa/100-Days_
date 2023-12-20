package day.pkg73;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan;

        do {
            System.out.println("Masukkan bilangan ganjil (0 untuk keluar):");
            bilangan = scanner.nextInt();

            if (bilangan != 0) {
                if (bilangan % 2 == 1) {
                    System.out.println("Anda memasukkan bilangan ganjil: " + bilangan);
                } else {
                    System.out.println("Bukan bilangan ganjil. Coba lagi.");
                }
            }

        } while (bilangan != 0);

        System.out.println("Program selesai.");
        scanner.close();
    }
    
}
