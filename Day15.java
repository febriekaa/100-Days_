
package day.pkg15;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Masukkan nilai:  ");
        double nilai = scanner.nextDouble();
        
        if (nilai >= 90){
            System.out.println("Kategori: A");
        }else if (nilai >= 80){
            System.out.println("Kategori : B");
        }else if (nilai >= 70){
            System.out.println("Kategori : C");
        }else if (nilai >= 60){
            System.out.println("Kategori : D");
        }else {
            System.out.println("Kategori : E");
        }    
                   
    }
    
}
