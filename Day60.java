
package day.pkg60;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] data = new int [2][2];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++){
                System.out.print("Masukkan indeks array ke " +i +" " +j+" ");
                data[i][j] = sc.nextInt();
                                     
            }System.out.println();
            
        }
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] +" ");
                      
            }System.out.println();
        }
    }
    
}
