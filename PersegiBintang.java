/*
 * NAMA : RAFI ALKABIR NIM : 2501083001
 * Deskripsi : Persegi Bintang
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class PersegiBintang {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,a,b;
        
        System.out.print("Masukkan angka pertama (baris): ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua (kolom): ");
        b = input.nextInt();
        
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=b;j++)
            {
                System.out.print(" * ");
            }
        System.out.println();
        }
    }
}
