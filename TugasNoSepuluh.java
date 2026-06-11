/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Membuat Program Tabel Bus
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */
import java.util.Scanner;
public class TugasNoSepuluh {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Tujuan =\n1.Jakarta\n2.Yogya\n3.Surabaya\n");
        System.out.print("Kelas =\n1.Eksekutif\n2.Bisnis\n3.Ekonomis\n");
        int kelas, tujuan, harga = 0, tiket, total;
        double diskon = 0, bayar;
        System.out.print("Masukan Tujuan Anda (1/2/3) = ");
        tujuan = input.nextInt();
        System.out.print("Masukan Kelas Anda (1/2/3) = ");
        kelas = input.nextInt();
        System.out.print("Masukan Jumlah Tiket = ");
        tiket = input.nextInt();
        if(tujuan == 1){
            if(kelas == 1){
                harga = 70000;
            }
            else if(kelas == 2){
                harga = 40000;
            }
            else if(kelas == 3){
                harga = 10000;
            }
        }
        if(tujuan == 2){
            if(kelas == 1){
                harga = 80000;
            }
            else if(kelas == 2){
                harga = 50000;
            }
            else if(kelas == 3){
                harga = 20000;
            }
        }
        if(tujuan == 3){
            if(kelas == 1){
                harga = 90000;
            }
            else if(kelas == 2){
                harga = 60000;
            }
            else if(kelas == 3){
                harga = 30000;
            }
        }
        total = harga * tiket;
        
        if(tujuan == 3 && kelas == 1 && tiket >=4 || tujuan==2 && kelas==3 && tiket>=4){
            diskon = total * 0.1;
        }
        
        bayar =total - diskon;
        System.out.println("Harga Tiket = "+harga);
        System.out.println("Total Harga = "+total);
        System.out.println("Diskon = "+diskon);
        System.out.println("Total yang harus dibayar = "+bayar);
    }
}
