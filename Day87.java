package day.pkg87;

public class Day87 {
    public static void main(String[] args) {
        int nilai [][] = {
            {37,45,99},
            {98,95,100},
            {86,54,18}
        };
        int nilaiTertinggi = nilai[0][0];
        int nilaiTerendah = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                }
                if (nilai[i][j] < nilaiTerendah) {
                    nilaiTerendah = nilai[i][j];
                }    
            }
        }
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
    }
    
}
