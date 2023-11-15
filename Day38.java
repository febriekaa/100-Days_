package day.pkg38;

public class Day38 {

    public static void main(String[] args) {
       
        int[] angkaArray = {10, 20, 30, 40, 50};

//        Menampilkan setiap angka dalam array
        System.out.println("Angka dalam array:");
        for (int angka : angkaArray) {
            System.out.println(angka);
        }

//        Menampilkan panjang (jumlah elemen) dari array
        System.out.println("Panjang array: " + angkaArray.length);

//        Menghitung dan menampilkan jumlah seluruh elemen dalam array
        int total = 0;
        for (int angka : angkaArray) {
            total += angka;
        }
        System.out.println("Jumlah seluruh elemen: " + total);
    }
}

  
