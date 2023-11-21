package day.pkg44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day44 {

    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
      
        System.out.println("Masukkan nama anda: ");
        String nama = reader.readLine();
        
        System.out.println("Masukkan umur anda: ");
        String inputUmur = reader.readLine();
        int umur = Integer.parseInt(inputUmur);
        
        System.out.println("Masukkan tinggi badan anda: ");
        String inputTb = reader.readLine();
        double tb = Double.parseDouble(inputTb);
        
        System.out.println("Masukkan berat badan anda: ");
        String inputBb = reader.readLine();
        double bb = Double.parseDouble(inputBb);
        
        System.out.println("Masukkan alamat anda: ");
        String alamat = reader.readLine();
        
        System.out.println("---BIODATA---");
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur +" tahun");
        System.out.println("Tinggi badan : " +tb + " cm");
        System.out.println("Berat badan : " +bb + " kg");
        System.out.println("Alamat : " +alamat);
        
        
    }
    
}
