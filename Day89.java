package day.pkg89;

import java.util.Scanner;

public class Day89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input modal awal dan lama investasi
        System.out.print("Masukkan modal awal investasi: ");
        double modalAwal = input.nextDouble();

        System.out.print("Masukkan lama investasi (dalam tahun): ");
        int lamaInvestasi = input.nextInt();

        // Prediksi keuntungan setiap tahun
        for (int tahun = 1; tahun <= lamaInvestasi; tahun++) {
            double keuntunganTahunan = modalAwal * 0.05;
            modalAwal += keuntunganTahunan;

            System.out.println("Tahun " + tahun + ": Keuntungan = " + keuntunganTahunan + ", Total Modal = " + modalAwal);
        }
    }
}
