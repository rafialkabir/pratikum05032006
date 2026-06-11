/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat Program Bentuk
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class TugasNoDelapan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i, j;
        System.out.print("Masukan Angka = ");
        n = input.nextInt();
        
        for(i = 1; i<=n; i++){
            for(j=1; j<=n; j++){
            if(i == 1 || i == n){
                System.out.print("0 ");
            }
            else if(i == j ){
                System.out.print("0 ");
            }
            else {
                System.out.print("* ");
            }
            
            }
            System.out.println();
        }
                
    }

}
