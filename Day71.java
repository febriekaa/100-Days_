package day.pkg71;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int belanjaan, diskon, bayar;
        String kartu;
        
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan >= 500000) {
                diskon = 50000;
            } else if (belanjaan >= 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }

        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }

        bayar = belanjaan - diskon;

        System.out.println("Total Bayar: Rp " + bayar);
    }
    
}
