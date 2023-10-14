
package day.pkg6;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     
        System.out.println("masukkan angka pertama:");
        int angka1 = scanner.nextInt();
        
        System.out.println("masukkan angka kedua:");
        int angka2 = scanner.nextInt();
        
        if (angka1>angka2) {
            System.out.println(angka1 +"lebih besar" + angka2);
        } else  if(angka1<angka2) {
            System.out.println(angka1 + "lebih kecil" + angka2);
        } else { 
            System.out.println("kedua sama besar:" +angka1);
        }
    }
  }
