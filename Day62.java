package day.pkg62;

import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] data = new int [2][3];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++){
                System.out.print("Masukkan indeks array ke " +i +" " +j+" ");
                data[i][j] = sc.nextInt();                
            }
            
        }
        for (int k[]: data){
            for(int array: k){
                System.out.print(array +" ");
                
            }System.out.println();
            
        }
    }
          
}
