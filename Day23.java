
package day.pkg23;

public class Day23 {

    public static void main(String[] args) {
        
        // konversi antara tipe data yang berbeda

        double angka1 = 12.22;
        int angka2;
        long angka3;
        float angka4;

        // Konversi dari tipe data double ke int
        angka2 = (int) angka1;

        // Konversi dari tipe data double ke long
        angka3 = (long) angka1;

        // Konversi dari tipe data double ke float
        angka4 = (float) angka1;

        System.out.println("Angka double: " + angka1);
        System.out.println("Angka int setelah konversi: " + angka2);
        System.out.println("Angka long setelah konversi: " + angka3);
        System.out.println("Angka float setelah konversi: " + angka4);
    }
}

