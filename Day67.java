package day.pkg67;

public class Day67 {

    public static void main(String[] args) {
      int array [] = {99,35,40,75,15};
        int elemenTerkecil = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < elemenTerkecil){
                elemenTerkecil = array[i];
            }
        }
        System.out.println("elemen array terkecil : " + elemenTerkecil);
    }
    
}
