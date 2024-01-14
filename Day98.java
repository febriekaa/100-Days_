package day.pkg98;

public class Day98 {

    public static void main(String[] args) {
        int[][][] angka = {
            {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}},
            {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}},
            {{5, 15, 25}, {35, 45, 55}, {65, 75, 85}}
        };

        int jumlah = 0;
        int min = angka[0][0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("angka[" + i + "][" + j + "][" + k + "] = " + angka[i][j][k]);
                    jumlah += angka[i][j][k];
                    if (angka[i][j][k] < min) {
                        min = angka[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total angka jika dijumlahkan adalah : " + jumlah);
        System.out.println("Angka terkecil dalam array adalah : " + min);
    }
}
