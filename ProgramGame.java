/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat Program Game
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class ProgramGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, m, i;
        System.out.print("Masukan Angka Awal = ");
        n = input.nextInt();
        System.out.print("Masukan Angka Akhir = ");
        m = input.nextInt();
        System.out.println("Nomor Misi Untuk Membuka Portal:");
        for(i=n; i<=m; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
