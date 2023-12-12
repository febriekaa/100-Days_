package day.pkg66;
public class Day66 {

    public static void main(String[] args) {
        int jumlahMahasiswa = 5;

        double[] nilaiMahasiswa = {80.5, 65.0, 75.5, 90.0, 85.5};

        double totalNilai = 0;
        for (double nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahMahasiswa;

        System.out.println("Nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }

        System.out.println("Rata-rata nilai: " + rataRata);
    }
}

  