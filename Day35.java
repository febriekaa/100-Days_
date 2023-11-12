package day.pkg35;


public class Day35 {

  
    public static void main(String[] args) {
        double[] rataRata = {88.9, 98.0, 95.5, 90.7, 80.9};
        double total = 0, 
               total1 = 0;
        
        for (double num : rataRata) {
        total += num; 
        total1 = total / rataRata.length;

}
        System.out.println("Jumlah nilai keseluruhan: " + total);
        System.out.println("NIlai rata-rata: " +total1);
        

    }
    
}
