package day.pkg48;

import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
        System.out.println("Masukkan berat badan anda(kg):  ");
        int bb = sc.nextInt();
        System.out.println("Masukkan tinggi badan anda(m):  ");
        double tb = sc.nextDouble();
        
        double bbIdeal = bb /(tb*tb);
        System.out.println("Berat badan ideal anda adalah:  "+ bbIdeal);
        
        
//        Menentukan kategori BMI
       if (bbIdeal < 18.5){
           System.out.println("Berat badan kurang");
       }else if ( bbIdeal >= 18.5 && bbIdeal < 25){
           System.out.println("Berat badan normal");
       }else if (bbIdeal >= 25 && bbIdeal < 30){
           System.out.println("Kelebihan berat badan");
       }else
            System.out.println("Obesitas");
       }
        
    }
    

