/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat tugas tentang Dina
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class DinaKetik {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, bayar, sisaH, sisaU;
        bayar = 15000;
        System.out.println("Pesana yang diterima = 50 ");
        System.out.print("Masukan jumlah yang telah dikerjakan : ");
        x = input.nextInt();
        sisaH = 50 - x;
        System.out.println("Sisa yang bisa dikerjakan : " +sisaH);
        bayar=15000*x;
        System.out.println("Uang yang didapat : "+bayar);
        sisaU = sisaH * 15000;
        System.out.println("Sisa uang : "+sisaU);
        
        
        
    }
    
}
