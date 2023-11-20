package day.pkg42;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka: ");
        
        int angka = sc.nextInt();
        
        for (int i = angka; i <= 99; i+=1) {    
            System.out.println(i);
        }
        }       
    }
    

