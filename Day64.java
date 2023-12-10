package day.pkg64;

public class Day64 {

    public static void main(String[] args) {
         int[] angka = {2, 8, 12, 18, 22};

        // Mencetak array menggunakan do-while loop
        System.out.println("Elemen-elemen array:");
        int i = 0;
        do {
            System.out.print(angka[i]+" ");
            i++;
        } while (i < angka.length);
    }
    
}
