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
public class max2 {
    public static void main (String[] args){
        int a,b,max;
        Scanner in = new Scanner(System.in);
        System.out.println("===Program Menentukan Bilangan Terbesar===");
        System.out.print("Bilangan 1 =");
        a = in.nextInt();
        System.out.print("bilangan 2 =");
        b = in.nextInt();
        if (a>b)
            max = a;
        else
            max = b;
        System.out.print(max+ " merupakan bilangan terbesar");
        
    }
    
}
