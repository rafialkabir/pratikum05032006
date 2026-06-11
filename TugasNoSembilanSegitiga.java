/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Program Tampilan
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class TugasNoSembilanSegitiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i, j, k;
        System.out.print("Masukan Angka = ");
        n = input.nextInt();
        for(i=n; i>=1; i--){
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            for(k=i;k<=n; k++){
                System.out.print(k);
            }
            
            System.out.println();
        }
    }
}
