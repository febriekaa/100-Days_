package day.pkg74;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan waktu (jam): ");
        double waktu = input.nextDouble();

        double jarak = kecepatan*waktu;

        System.out.println("Jarak tempuh: " + jarak + " kilometer");

        input.close();
    
    }
    
}
