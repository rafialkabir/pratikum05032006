/*
 * NAMA : RAFI ALKABIR NIM: 2501083001
 * Desk    : Soal latihan 1
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class CekAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int jumlah = 0;
        do {
            System.out.print("Masukkan angka (<=0 untuk berhenti): ");
            angka = input.nextInt();

            if (angka > 0) {
                jumlah++;
            }

        } while (angka > 0);

        System.out.println("Jumlah angka yang diinputkan: " + jumlah);
    }
}
