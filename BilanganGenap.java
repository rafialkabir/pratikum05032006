/*
 * Nama : Rafi Alkabir Nim : 2501083001
 * Deskripsi :Membuat Program Bilangan Genap
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class BilanganGenap {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Genap = ");
        n = input.nextInt();
        while(n % 2 != 0){
            System.out.println("Silahkan Masukan Angka Genap");
            System.out.print("Masukan Angka Genap = ");
            n = input.nextInt();
        }
        n = n + 1;
        System.out.println(n);
    }
}
