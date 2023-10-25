package day.pkg17;

import java.util.Scanner;

public class Day17 {

   
    public static void main(String[] args) {
    
    //  Menghitung luas dan keliling bangun datar jajar genjang
       
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas (a): ");
        int alas= input.nextInt();

        System.out.print("Masukkan panjang sisi miring (b): ");
        int SisiMiring = input.nextInt();

        System.out.print("Masukkan tinggi h: ");
        int tinggi = input.nextInt();

        // Menghitung luas jajar genjang
        int luas = alas * tinggi;

        // Menghitung keliling jajar genjang
        int keliling = 2 * (alas + SisiMiring);

        System.out.println("Luas jajar genjang adalah: " + luas);
        System.out.println("Keliling jajar genjang adalah: " + keliling);

        





    }
    
}
