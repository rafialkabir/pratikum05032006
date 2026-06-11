/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat Program Ulang Tahun PNP
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class ProgramUltahPnp {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, dkd;
        System.out.print("Masukan Umur PNP =  ");
        n = input.nextInt();
        if(n % 10 == 0){
            dkd = n / 10;
            System.out.println("Dekade PNP Ke-"+dkd);
        }
        else {
            System.out.println("Dies Natalis PNP Ke-"+n);
        }
    }
}
