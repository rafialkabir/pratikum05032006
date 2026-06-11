/*
 * Nama : Rafi Alkabir  No BP : 2501083001
 * menghitung gaji karyawan berdasarkan jam reguler dan lembur
 */
package praktikum05032026;

/**
 *
 * @author Lab_Jaringan_05
 */
import java.util.Scanner;
public class Gajipegawai {
    public static void main(String[] args){
            int upahreguler = 50000;
            int upahlembur = 70000;
            int jamkerjareguler, jamkerjalembur, gajisebulan;
            
            Scanner input = new Scanner (System.in);
            
            
            System.out.println("=== Program Menghitung Gaji Bulanan Karyawan ===");
            System.out.print("\t Jam Kerja Reguler \t =");
            jamkerjareguler = input.nextInt();
            System.out.print("\t Jam Kerja lembur \t =");
            jamkerjalembur = input.nextInt();
            gajisebulan = (jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur);
            System.out.println("\tGaji pegawai bulan ini\t ="+gajisebulan);
            
                    }
    
}
