/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat Program Lembur Karyawan
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class TugasNoTujuhLembur {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, upah = 0;
        System.out.print("Masukan Jam Lembur = ");
        n = input.nextInt();
        if(n <= 20){
            upah = 2000*n;
        }
        if(n > 20 && n <=50){
            upah = 3000*n;
        }
        if(n > 50){
            System.out.println("Jam Lembur Maksimal Hanya 50 Jam");
            upah = 3000*50;
        }
          
        System.out.println("Upah Lembur =Rp."+upah);
    }
}
