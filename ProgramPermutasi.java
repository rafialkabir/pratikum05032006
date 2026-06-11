/*
 * NAMA :RAFI ALKABIR NIM : 2501083001
 * Deskripsi: PROGRAM PERMUTASI
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class ProgramPermutasi {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, i, permutasi,faktorial1, faktorial2;
        
        System.out.print("Masukkan angka (n) : ");
        n = input.nextInt();
        System.out.print("Masukkan angka (r) : ");
        r = input.nextInt();
        
        faktorial1 = 1;
        faktorial2 = 1;
        
        for(i=1;i<=n;i++)
        {
            faktorial1 = faktorial1 * i;
        }
        for(i=1;i<=n-r;i++)
        {
            faktorial2 = faktorial2 * i;
        }
        
        permutasi = faktorial1 / faktorial2;
        System.out.println("Nilai permutasi dari angka "+n+" dan angka "+r+ " yaitu : "+permutasi);
    }
    
}
