
package dayy.pkg5;

import java.util.Scanner;

public class Dayy5 {
    
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("masukkan angka pertama:");
        int angka1= scanner.nextByte();
        
        System.out.println("masukkan angka kedua");
        int angka2= scanner.nextByte();
        
        int penjumlahan= angka1+angka2;
        int pengurangan= angka1-angka2;
        int perkalian =angka1*angka2;
        int pembagian= angka1/angka2;
        
        System.out.println("Hasil penjumlahan:" +penjumlahan);
        System.out.println("Hasil pengurangan:" +pengurangan);
        System.out.println("Hasil perkalian:" +perkalian);
        System.out.println("Hasil pembagian:" +pembagian);
        
       
    }
    
}
