package day.pkg31;

import java.util.Scanner;

public class Day31 {
    
    
public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);

      System.out.println("Masukkan usia: ");
      int usia = sc.nextInt();
      String kategori;
      
      if (usia >= 0 && usia <= 5) {
            kategori = "Balita";
        } else if (usia >= 6 && usia <= 12) {
            kategori = "Anak-anak";
        } else if (usia >= 13 && usia <= 17) {
            kategori = "Remaja";
        } else {
            switch (usia) {
                case 18:
                case 19:
                    kategori = "Dewasa Muda";
                    break;
                case 20:
                case 21:
                    kategori = "Dewasa Awal";
                    break;
                default:
                    kategori = "Kategori tidak ditemukan";
                    break;
            }
        }
     System.out.println("Usia " + usia  + " adalah kategori " + kategori);
      sc.close();
    }
     
 }

