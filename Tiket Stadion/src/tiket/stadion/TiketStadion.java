/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket.stadion;

import java.util.Scanner;

/**
 *
 * @author Xie Yue
 */
public class TiketStadion extends Pesan {

    /**
     * @param args the command line arguments
     */
    
    Scanner imp = new Scanner(System.in);
    static TiketStadion objek = new TiketStadion("",0,0,0,0,"");
    
    static String dat;
    
    public TiketStadion(String nama, int harga, int tgl, int kelas, int bangku, String menu) {
        super(nama, harga, tgl, kelas, bangku, menu);
    }
    
    void Input(){
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("Isilah data berikut untuk memesan tiket");
        System.out.println("=======================================");
        System.out.println("Masukan nama Anda : ");
        nama= imp.next();
        //imp.nextInt();
        System.out.println("Masukan tanggal   : ");
        tgl= imp.nextInt();
    };
    
    void Kelas(){
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("Pada Tanggal      : "+tgl);
        System.out.println("Pertandingan      : Persib Vs Persibaya");
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("===== Kelas =====");
        System.out.println("1. Tribun Bawah");
        System.out.println("2. Tribun Atas");
        System.out.println("3. VIP");
        System.out.println("=================");
        System.out.println("Pilih Kelas : ");
        kelas = imp.nextInt();
        System.out.println("No Bangku   : ");
        bangku = imp.nextInt();
    };
    
    void Harga(){
        switch (kelas) {
            case 1:
                harga = 50000;
                dat = "Tribun Bawah";
                break;
            case 2:
                harga = 75000;
                dat = "Tribun Atas";
                break;
            case 3:
                harga = 100000;
                dat = "VIP";
                break;
            default:
                harga = 0;
                break;
        }
        
    };
    
    void Menu(){
         
        for (int bts=1; bts<2;){
            System.out.println("");
            System.out.println("=======================================");
            System.out.println("        Menu Pemesanan E-Tiket         ");
            System.out.println("=======================================");   
            System.out.println("1. Pesan Tiket ");
            System.out.println("2. Cetak Tiket ");
            System.out.println("=======================================");
            System.out.println("");
            System.out.print("Masukan Perintah : ");
            int menu = imp.nextInt();
        if (menu==1){
            objek.Input();
            objek.Kelas();
            objek.Harga();
        }
        else{
            System.out.println("");
            System.out.println("=======================================");
            System.out.println(" Anda telah memesan tiket Pertandingan ");
            System.out.println("          Persib Vs Persebaya          ");
            System.out.println("=======================================");
            System.out.println("Pada Tgl: "+tgl);
            System.out.println("Kelas   : "+kelas+". "+dat);
            System.out.println("Bangku  : "+bangku);
            System.out.println("");
            System.out.println("Atasnama: "+nama);
            System.out.println("");
            System.out.println("Seharga : "+harga);
            System.out.println("=======================================");
            
            bts = 2;
            }
        }
    };
    
    public static void main(String[] args) {
        objek.Menu();
    }

    
    
}
