/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat Deret Bilangan 11
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class DeretBilanganSebelas {
public static void main(String[] args){
        int n, i, m, jumlah, total, rata_rata;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Awal = ");
        n = input.nextInt();
        System.out.print("Masukan Angka Akhir = ");
        m = input.nextInt();
        jumlah = 0;
        total = 0;
        if(n < m){
            for(i=n; i<=m; i++){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jumlah++;
                    total = total + i;
                }
            }
        }
        else {
            for(i=n; i>=m; i--){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jumlah++;
                    total = total + i;
                }
            }
        }
        rata_rata = total / jumlah;
        System.out.print("\nJumlah \t\t:"+jumlah+"\nTotal \t\t:"+total+"\nRata-rata \t:"+rata_rata);
    }
}
