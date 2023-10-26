
package day.pkg18;

import java.util.Scanner;


public class Day18 {

   
    public static void main(String[] args) {
    
        double phi = 3.14; 
        Scanner input = new Scanner(System.in);
        
        double r,diameter,luas,keliling;
        
        System.out.println("Masukkan jari-jari (r): ");
        r = input.nextDouble();
        
        diameter = 2*r;
        
//      menghitung luas lingkaran
        luas = phi*r*r;
//      menghitung keliling lingkaran         
        keliling = 2 * phi * r;
        
        System.out.println("Luas lingkaran adalah: " +luas);
        System.out.println("Keliling lingkaran adalah: "+keliling);

        
        
        
        
    }
    
}
