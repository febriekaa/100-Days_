package day.pkg34;


public class Day34 {

 
    public static void main(String[] args) {
      
//        Deklarasi dan inisialisasi array string
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        // Menampilkan isi array menggunakan loop
        System.out.println("Daftar Hari dalam Seminggu:");
        for (int h = 0; h < namaHari.length; h++) {
            System.out.println("Hari ke-" + (h + 1) + ": " + namaHari[h]); 
        }
    }
}

   
