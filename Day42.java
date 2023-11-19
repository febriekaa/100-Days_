package day.pkg42;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka: ");
        
        int angka = sc.nextInt();
        
        for (int i = angka; i <= 100; i+=2) {    
            System.out.println(i);
        }
        }       
    }
    

