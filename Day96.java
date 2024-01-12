package day.pkg96;
public class Day96 {

    public static void main(String[] args) {
       
        int[][][] array3D = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    array3D[i][j][k] = i + j + k;
                }
            }
        }

        System.out.println("Nilai array sebelum perubahan:");
        cetakArray3D(array3D);

        int indeksI = 1;
        int indeksJ = 2;
        int indeksK = 3;
        int nilaiBaru = 100;

        array3D[indeksI][indeksJ][indeksK] = nilaiBaru;

        System.out.println("\nNilai array setelah perubahan:");
        cetakArray3D(array3D);
    }

    public static void cetakArray3D(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

   