
package day.pkg20;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Selamat datang! Apakah Anda mencari rekomendasi DRAKOR?");
            System.out.println("Berikut beberapa genre film yang populer:");
            System.out.println("1. Action");
            System.out.println("2. Komedi");
            System.out.println("3. Romance");
            System.out.println("4. Crime");
            System.out.println("5. Fantasi");
            
            System.out.print("Silakan pilih nomor genre DRAKOR yang Anda inginkan: ");
            int pilihan = input.nextInt();
            

            if (pilihan == 1) {
                System.out.println("Genre action saya merekomendasikan 'THE K2'");
            } else if (pilihan == 2) {
                System.out.println("Genre komedi,'Welcome to waikiki' bisa menjadi pilihan yang bagus.");
            } else if (pilihan == 3) {
                System.out.println("Genre romance, saya merekomendasikan 'Crash landing on you' sangat bagus.");
            } else if (pilihan == 4) {
                System.out.println("Genre crime, saya memiliki dua rekomendasi, yaitu 'The first responders' dan 'Partner for justice' .");
            } else if (pilihan == 5){ 
                System.out.println("Genre fantasi, 'Legend of the blue sea' pilihan yang sangat bagus");
            }else {
                System.out.println("Maaf, nomor yang anda pilih tidak terdapat dalam rekomendasi");      
    }
}

    }
    

