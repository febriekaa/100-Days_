package day.pkg36;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
     String buah[] = new String[5];
     
     Scanner sc = new Scanner(System.in);
     
//     mengisi data ke array
    for( int b= 0; b < buah.length; b++ ){
        System.out.println("Buah ke-" +(b+1) + ": ");
        buah[b]= sc.nextLine();
        

    }
     
    }
    
}
