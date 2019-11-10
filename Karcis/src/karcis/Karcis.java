/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karcis;
import java.util.Scanner;
/**
 *
 * @author Khalsa
 */
public class Karcis {

    public static int harga,uang,jalur,kembali,ttl,min;
    static String tujuan;
    Scanner imp = new Scanner(System.in);
    static Karcis objek = new Karcis();
    
    void jalur(){
        System.out.println("----- Jalur Kereta -----");
        System.out.println("");
        System.out.println("1. Bandung    (Rp 25000)");
        System.out.println("2. Jakarta    (Rp 30000)");
        System.out.println("3. Surabaya   (Rp 35000)");
        System.out.println("4. Yogyakarta (Rp 40000)");
        System.out.println("5. Karawang   (Rp 45000)");
        System.out.println("");
        //System.out.println("");
        System.out.print("Pilih Jalur : ");
        jalur = imp.nextInt();
        
        switch (jalur) {
            case 1:
                harga = 25000;
                tujuan = "Bandung";
                break;
            case 2:
                harga = 30000;
                tujuan = "Jakarta";
                break;
            case 3:
                harga = 35000;
                tujuan = "Surabaya";
                break;
            case 4:
                harga = 40000;
                tujuan = "Yogyakarta";
                break;
            case 5:
                harga = 45000;
                tujuan = "Karawang";
                break;
            default:
                harga = 0;
                break;
        }
    };
    
    void input(){
        System.out.print("Masukan Uang : ");
        uang = imp.nextInt();
        System.out.print("");
        
        if (uang == harga){
            System.out.print("");
            System.out.println("Uang Anda Cukup");
            System.out.println("Silahkan Ambil Karcis");
        }
        else if (uang < harga){
            for (int cukup = 0;cukup<1;){
                if (uang < harga){
                    min = harga-uang;
                    System.out.println("Uang Anda Kurang "+min);
                    System.out.print("Masukan kembali : ");
                    ttl = imp.nextInt();
                    uang = uang + ttl;
                }
                else if (uang == harga){
                    System.out.print("");
                    System.out.println("Uang Anda Cukup");
                    System.out.println("Silahkan Ambil Karcis");
                    cukup = 1;
                }    
                else if (uang > harga){
                    kembali = uang - harga;
                    System.out.print("");
                    System.out.println("Uang Anda Lebih");
                    System.out.println("Kembalian Anda : "+kembali);
                    System.out.println("Silahkan Ambil Karcis");
                    cukup = 1;
                }
                else if (uang < 0){
                    System.out.println("Uang Anda negatif");
                    System.out.print("Masukan kembali : ");
                    uang = imp.nextInt();
                }
                else{  
                }
            }
        }
        else if (uang > harga){
            kembali = uang - harga;
            System.out.print("");
            System.out.println("Uang Anda Lebih");
            System.out.println("Kembalian Anda : "+kembali);
            System.out.println("Silahkan Ambil Karcis");
        }
        else{
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        objek.jalur();
        
        System.out.println("");
        System.out.println("Tujuan anda = "+tujuan);
        System.out.println("Harga       = "+harga);
        System.out.println("");
        
        objek.input();
    }
    
}
