/*
 * Nama : Rafi Alkabir  Nim : 2501083001
 * Deskripsi : Ini Tugas Tentang Swalayan   
 */
package praktikum05032026;

/**
 *
 * @author asus-
 */

import java.util.Scanner;
public class Swalayan {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, jumlah, sdiskon;
        double diskon, total;
        System.out.println("1.Merek X = Rp.40.000");
        System.out.println("2.Merek Y = Rp.50.000");
        System.out.println("3.Merek Z = Rp.60.000");
        System.out.print("Masukan Angka Merek Susu (1/2/3): ");
        n = input.nextInt();
            if(n == 1){
                System.out.print("Masukan jumlah yang di beli = ");
                jumlah = input.nextInt();
                System.out.println("==================================");
                if(jumlah >= 3){
                    diskon = jumlah*(40000 * 0.1);
                    sdiskon = jumlah * 40000;
                    total = (jumlah * 40000)-diskon;
                    System.out.println("Merk Susu \t:X");
                    System.out.println("Jumlah Barang \t:" +jumlah);
                    System.out.println("Harga Asli \t:"+sdiskon);
                    System.out.println("Diskon \t\t:"+diskon);
                    System.out.println("Total \t\t:Rp."+total);
                }
                if(jumlah < 3){
                    sdiskon = jumlah * 40000;
                    System.out.println("Merk Susu \t:X \nJumlah Barang \t:" +jumlah+ "\nTotal \t\t:Rp."+sdiskon);
                }
            }
            if(n == 2){
                System.out.print("Masukan jumlah = ");
                jumlah = input.nextInt();
                System.out.println("==================================");
                if(jumlah > 3){
                    diskon = jumlah*(50000 * 0.12);
                    sdiskon = jumlah * 50000;
                    total = (jumlah * 50000)-diskon;
                    System.out.println("Merk Susu \t:Y");
                    System.out.println("Jumlah Barang \t:" +jumlah);
                    System.out.println("Harga Asli \t:"+sdiskon);
                    System.out.println("Diskon \t\t:"+diskon);
                    System.out.println("Total \t\t:Rp."+total);
                }
                if(jumlah <= 3){
                    sdiskon = jumlah * 50000;
                    System.out.println("Merk Susu \t:Y \nJumlah Barang \t:" +jumlah+ "\nTotal \t\t:Rp."+sdiskon);
                }
            }
            if(n == 3){
                System.out.print("Masukan jumlah = ");
                jumlah = input.nextInt();
                System.out.println("==================================");
                    diskon = (jumlah-1)*(60000-(60000*0.15));
                    total = 60000 + diskon;
                    System.out.println("Merk Susu \t:Z");
                    System.out.println("Jumlah Barang \t:"+jumlah);
                    System.out.println("Total \t\t:Rp."+total);
                
            }
    }
}
