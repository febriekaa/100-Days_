
package day.pkg7;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
         
        System.out.println("masukkan panjang:");
        double panjang = scanner.nextDouble();
        
        System.out.println("masukkan lebar:");
        double lebar = scanner.nextDouble();
        
        double luas = panjang*lebar;
        System.out.println("luas persegi panjang:"+luas);
        
      
    }
    
}
