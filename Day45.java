package day.pkg45;

import javax.swing.JOptionPane;

public class Day45 {

    public static void main(String[] args) {
       String NAMA, NIM, KELAS;
       
       NAMA = JOptionPane.showInputDialog("Input Nama anda: ");
       String nama = "Hello " + NAMA + "!";
       JOptionPane.showMessageDialog(null,nama);
          
       NIM = JOptionPane.showInputDialog("Input NIM anda: ");
       String nim = "NIM Anda adalah " + NIM + "!";
       JOptionPane.showMessageDialog(null,nim);   
       
       KELAS = JOptionPane.showInputDialog("Input Kelas anda: ");
       String kelas = "Kelas Anda adalah " + KELAS + "!";
       JOptionPane.showMessageDialog(null,kelas);      
       
    }
    
}
