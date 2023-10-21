package day.pkg13;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
         
System.out.println("Menentukan zodiak");
    
   Scanner input = new Scanner(System.in);
   
   System.out.println("Masukkan tanggal lahir anda: ");
   int tanggal = input.nextInt();
   
   System.out.println("Masukkan bulan kelahiran anda: ");
   int bulan = input.nextInt();
   
   if (tanggal > 31 && bulan > 12){
       System.out.println("Input tidak tersedia");
   }else {
       
       if (tanggal > 21 && bulan == 12 || tanggal < 20 && bulan ==1){
           System.out.println("Zodiak anda adalah CAPRICORN");
       }else if (tanggal > 19 && bulan == 1 || tanggal < 19 && bulan ==2 ){
           System.out.println("Zodiak anda adalah AQUARIUS");
       }else if (tanggal > 18 && bulan == 2 || tanggal < 21 && bulan ==3){
           System.out.println("Zodiak anda adalah PISCES");
       }else if (tanggal > 20 && bulan ==3 || tanggal < 20 && bulan ==4){
           System.out.println("Zodiak anda adalah ARIES");
       }else if (tanggal > 19 && bulan ==4 || tanggal < 21 && bulan ==5){
           System.out.println("Zodiak anda adalah TAURUS");
       }else if (tanggal > 20 && bulan ==5 || tanggal < 21 && bulan ==6){
           System.out.println("Zodiak anda adalah GEMINI");
       }else if (tanggal > 20 && bulan ==6 || tanggal < 23 && bulan ==7){
           System.out.println("Zodiak anda adalah CANCER");
       }else if (tanggal > 22 && bulan ==7 || tanggal < 23 && bulan ==8){
           System.out.println("Zodiak anda adalah LEO");
       }else if (tanggal > 22 && bulan ==8 || tanggal < 23 && bulan ==9){
           System.out.println("Zodiak anda adalah VIRGO");
       }else if (tanggal > 22 && bulan ==9 || tanggal < 23 && bulan ==10){
           System.out.println("Zodiak anda adalah LIBRA");
       }else if (tanggal > 22 && bulan ==10 || tanggal < 22 && bulan ==11){
           System.out.println("Zodiak anda adalah SCORPIO");
       }else if (tanggal > 21 && bulan ==11 || tanggal < 22 && bulan ==12){
           System.out.println("Zodiak anda adalah SAGITARIUS");
       }else {
           System.out.println("Input tidak tersedia");
       }
           
   }
     
   
        }
    
}
