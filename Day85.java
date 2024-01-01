package day.pkg85;

import java.util.Arrays;

public class Day85 {

    public static void main(String[] args) {
         int [] nilai = {95, 55, 82, 100, 78, 89,69};
        Arrays.sort(nilai);
        int i = 0;
        while(i < nilai.length){
            System.out.println(nilai[i]);
            i++;
        }
    }
    
}
