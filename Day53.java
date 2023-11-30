package day.pkg53;

public class Day53 {

    public static void main(String[] args) {
        int angka[] = {31,23,34,46,57,89,92};
        
        int jumlah = 0;
        
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
            System.out.println("Jumlah keseluruhan Array adalah " +jumlah);
        
    }
    
}
