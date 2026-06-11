/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum05032026;

/**
 *
 * @author Lab_Jaringan_05
 */
import java.util.Scanner;
public class BonusAkhirTahun {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int gol,masakerja,umur;
        long bonus = 0;
        System.out.println("===Program Bonus Akhir Tahun===");
        System.out.println("Golongan Karyawan : \n 1. Staf\n 2. Non-Staf : \n 3");
         System.out.println("=================================");
         System.out.print("Golongan anda (1/2)\t:");
         gol = in.nextInt();
         System.out.print("Lama Kerja\t\t: ");
         masakerja = in.nextInt();
         System.out.print("Usia\t\t\t: ");
         umur=in.nextInt();
         switch(gol){
                 case 1: //staf
                 {
                     if(masakerja>5 && umur>45)
                         bonus=6000000;
                     else
                         bonus=2500000;
                 }break;
                 default:
                 {
                     System.out.println("Golongan Anda Salah");
                     bonus = 0;
                 }break;
                     
         }
         System.out.println("Bonus akhir tahun anda\t : Rp");
                         
                 
        
        
    }
    
}
