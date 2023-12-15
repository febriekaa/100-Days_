package day.pkg69;
public class Day69 {

    public static void main(String[] args) {
      int array [] = {99,35,40,75,15};
        int elemenTerbesar = array[0];

        for (int i = 0; i > array.length; i++) {
            if(array[i] > elemenTerbesar){
                elemenTerbesar = array[i];
            }
        }
        System.out.println("elemen array terbesar : " + elemenTerbesar);
        
    }
    
}
