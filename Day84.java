package day.pkg84;

import java.util.Arrays;

public class Day84 {

    public static void main(String[] args) {
         String[] buah = {"Mangga","Jeruk","Apel","Durian","Cherry","Buah naga"};
        Arrays.sort(buah);
        int i = 0;
        while(i < buah.length){
            System.out.println(buah[i]);
            i++;
        }
    }
    
}
