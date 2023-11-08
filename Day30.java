
package day.pkg30;

import java.util.Scanner;


public class Day30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kode ukuran celana (S, M, L, XL):");
        char kodeUkuran = sc.next().charAt(0);

        String ukuranCelana = "";

        switch (kodeUkuran) {
            case 'S':
                ukuranCelana = "36";
                break;
            case 'M':
                ukuranCelana = "38";
                break;
            case 'L':
                ukuranCelana = "40";
                break;
            case 'X':
                ukuranCelana = "42-45";
                break;
           
            default:
                System.out.println("Kode ukuran tidak valid");
               
        }

        System.out.println("Ukuran celana untuk kode " + kodeUkuran + " adalah " + ukuranCelana);

       sc.close();
    }
}

 
