package day.pkg88;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka batas atas: ");
        int batasAtas = scanner.nextInt();
        int[] array = new int[batasAtas];
        int jumlah = 0;
        for (int i = 0; i < batasAtas; i++) {
            array[i] = i + 1;
            if (array[i] % 3 == 0) {
                jumlah++;
            }
        }
        System.out.println("Jumlah angka yang habis dibagi 3 adalah: " + jumlah);
    }
    
}
