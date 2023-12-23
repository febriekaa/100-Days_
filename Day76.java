package day.pkg76;

import java.util.Scanner;

public class Day76 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan gaji pokok: ");
        int gajiPokok = sc.nextInt();
        
        System.out.println("Masukkan lama lembur perjam: ");
        int lembur = sc.nextInt();
        
        int gajiLembur = lembur*55000;  
        
        int gajiBersih = gajiPokok+gajiLembur;
        System.out.print("Gaji bersih yang diterima adalah "+gajiBersih);
        
       
        System.out.println();
        
    } 
    
}
