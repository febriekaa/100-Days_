package day.pkg19;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
        
//      Menentukan nilai tukar KRW ke IDR
        double exchangeRate = 11.74; 

        System.out.print("Masukkan jumlah Won Korea selatan (KRW): ");
        double KRWamount = input.nextDouble();
        
//      Melakukan konversi mata uang
        double IDRamount = KRWamount * exchangeRate;
        
        System.out.println(KRWamount + " KRW setara dengan " + IDRamount + " IDR");
        
        
        
    
}

    }
    

