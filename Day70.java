package day.pkg70;

import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        String[][] dataMahasiswa = new String[jumlahMahasiswa][3];  

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            
            
            System.out.print("Masukkan Nama: ");
            dataMahasiswa[i][0] = sc.next();
            System.out.print("Masukkan NIM: ");
            dataMahasiswa[i][1] = sc.next();
            System.out.print("Masukkan Nilai: ");
            dataMahasiswa[i][2] = sc.next();
        }    
        System.out.println("Hasil Input:");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + dataMahasiswa[i][0]);
            System.out.println("NIM: " + dataMahasiswa[i][1]);
            System.out.println("Nilai: " + dataMahasiswa[i][2]);
            System.out.println();
        }

        
        sc.close();
    }
}

   
