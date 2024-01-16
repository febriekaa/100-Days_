package day.pkg100;

import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array tiga dimensi untuk menyimpan data mahasiswa (nama, nim, dan nilai)
        String[][][] dataMahasiswa = new String[2][3][4];

        // Mengisi data mahasiswa
        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan data untuk Mahasiswa " + (i + 1));
            System.out.print("Nama: ");
            dataMahasiswa[i][0][0] = scanner.next();
            System.out.print("NIM: ");
            dataMahasiswa[i][1][0] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai mata kuliah " + (j + 1) + ": ");
                dataMahasiswa[i][0][j + 1] = scanner.next();
            }
            System.out.println();
        }

        // Menganalisis data mahasiswa
        System.out.println("Hasil Analisis Data Mahasiswa:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ":");
            System.out.println("Nama: " + dataMahasiswa[i][0][0]);
            System.out.println("NIM: " + dataMahasiswa[i][1][0]);

            // Menghitung rata-rata nilai mahasiswa
            double totalNilai = 0;
            for (int j = 0; j < 3; j++) {
                totalNilai += Double.parseDouble(dataMahasiswa[i][0][j + 1]);
            }
            double rataRata = totalNilai / 3;

            System.out.println("Rata-rata Nilai: " + rataRata);
            System.out.println();
        }

        // Menghitung rata-rata kelas
        double totalNilaiKelas = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                totalNilaiKelas += Double.parseDouble(dataMahasiswa[i][0][j + 1]);
            }
        }
        double rataRataKelas = totalNilaiKelas / (2 * 3);

        System.out.println("Rata-rata Kelas: " + rataRataKelas);

        scanner.close();
    }
}

  
