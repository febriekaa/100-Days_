package day.pkg95;

public class Day95 {

    public static void main(String[] args) {
        int[][][] array3D = new int[3][4][5];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    array3D[i][j][k] = i + j + k;
                }
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}
