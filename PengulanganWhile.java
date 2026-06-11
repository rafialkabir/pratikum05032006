/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum05032026;

/**
 *
 * @author Lab_Jaringan_05
 */
import java.util.Scanner;
public class PengulanganWhile {
    public static  void main(String[] args){
        Scanner in = new Scanner (System.in);
        int i,n;
        System.out.print("Masukan Sebuah Angka : ");
        n = in.nextInt();
        System.out.println("Pengulangan While");
        System.out.println("Menampilkan Angka 1 Sampai" +n+" : ");
        i=1;
        while (i<=n)
        {
            System.out.print(i+"\t");
                    i++;
        }
        System.out.println("\nMenampilkan Angka Dari" +n+" : ");
        i=n;
        while (i>=1)
        {
            System.out.print(i+"\t");
                    i--;
        }
        
        
                
        
        
    }
    
}
