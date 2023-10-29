
package day.pkg21;

import java.util.Scanner;

public class Day21 {

 
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("masukkan gaji: ");
        double gaji = input.nextDouble();
        
        System.out.println("gaji" + gaji);
        
        if (gaji > 2000000 && gaji <= 5000000){
            System.out.println("pajak 5%");
            System.out.println(gaji - (gaji*0.5));
        }else if (gaji > 5000000){
            System.out.println("pajak 10%");
            System.out.println(gaji - (gaji*0.1));
        }else{
            System.out.println("tidak kena pajak");
            
        }
    }
    
}
    
    

