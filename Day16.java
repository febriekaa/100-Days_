package day.pkg16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {

//  menghitung luas bangun datar trapesium
     Scanner input = new Scanner(System.in);
     
        System.out.println("Masukkan panjang sisi sejajar atas (a): ");
        double a = input.nextDouble();
        
        System.out.println("Masukkan panjang sisi sejajar bawah (b): ");
        double b = input.nextDouble();
        
        System.out.println("Masukkan tinggi trapesium (t): ");
        double t = input.nextDouble();
        
        double luas = (0.5)*(a+b)*t;
    
        System.out.println("Luas trapesium adalah: "+luas);
        
                
                

    }
    
}
