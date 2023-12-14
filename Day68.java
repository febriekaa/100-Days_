package day.pkg68;
public class Day68 {

    public static void main(String[] args) {
        // Membuat array boolean untuk menyimpan kehadiran siswa
        boolean[] kehadiranSiswa = {true, false, true, true, false, true};

        // Menampilkan kehadiran siswa
        System.out.println("Kehadiran Siswa: ");

        for (int i = 0; i < kehadiranSiswa.length; i++) {
            System.out.println("Siswa " + (i + 1) + ": " + (kehadiranSiswa[i] ? "Hadir" : "Tidak Hadir"));
        }
    }
}

   

