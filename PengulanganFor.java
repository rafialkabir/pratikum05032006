/*
 * Nama : Rafi Alkabir NIM : 2501083001
 * Desk    : Membuat perulangan dalam bahasa java
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class PengulanganFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n;
        System.out.print("Masukkan objek bilangan : ");
        n = input.nextInt();
        System.out.println("Perulangan dari 1 sampai ke-"+n+" yaitu :");
        
        for(i=1;i<=n;i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("Perulangan dari "+n+ " sampai ke-1 yaitu :");
        
        for(i=n;i>=1;i--)
        {
            System.out.print(i+"\t");
        }
    }
}
