package day.pkg61;

import java.util.Arrays;
import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] data = new int [2][2];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++){
                System.out.println("Masukkan indeks array ke " +i +" " +j+" ");
                data[i][j] = sc.nextInt();
                                     
            }
                      
            System.out.println(Arrays.deepToString(data));
        }
    }
    
}

