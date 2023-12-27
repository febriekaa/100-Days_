package day.pkg80;

import java.util.Scanner;

public class Day80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        while (angka %2 == 0){
            System.out.println("genap");
            
            System.out.println("masukkan angka: ");
            angka = sc.nextInt();
            while(angka %2 == 1){
                System.out.println("you and i, end.");
                break;
            }
        }
        
    }
    
}
