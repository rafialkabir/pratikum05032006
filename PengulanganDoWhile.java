/*
 * NAMA : RAFI ALKABIR NIM : 2501083001
 *Desk    : Membuat perulangan do while menggunakan java
 */
package praktikum05032026;

/**
 *
 * @author Lab_Jaringan_05
 */
import java.util.Scanner;
public class PengulanganDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n;
        System.out.print("Masukkan sebuah angka : ");
        n = in.nextInt();
        
        System.out.println("Pengulangan While");
        System.out.println("Menampilkan angka 1 sampai "+n+" :");
        i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while (i<=n);
        
        System.out.println("\nMenampilkan angka dari "+n+" sampai 1 :");
        i=n;
        do{
            System.out.print(i+"\t");
            i--;
        }while (i>=1);
    }
}
