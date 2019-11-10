/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_gadget;

import java.util.Scanner;

//pakai import di main , pakai metode polymor error
import p_gadget.Gadget;
import p_gadget.Pelanggan;

/**
 *
 * @author Xie Yue
 */
public class Pembelian{

    /**
     * @param args the command line arguments
     */
    
    //buat objek
    static Pelanggan plg = new Pelanggan(0,"",0,"");
    static Gadget gdg = new Gadget("","","","",0);
    static Scanner imp = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        for (int bts=1; bts<2;){
            System.out.println("");
            System.out.println("=======================================");
            System.out.println("            Pembelian Gadget           ");
            System.out.println("=======================================");   
            System.out.println("1. Input Data Pembelian ");
            System.out.println("2. Lihat Data Pembeli ");
            System.out.println("3. Keluar ");
            System.out.println("=======================================");
            System.out.println("");
            System.out.print("Masukan Perintah : ");
            int menu = imp.nextInt();
        if (menu==1){
            System.out.println("");
            System.out.println("============ Input Data ===============");
            
            plg.setNama();
            plg.setUmur();
            plg.setAlamat();
            
            gdg.setjenis();
            gdg.setmerk();
            gdg.setwarna();
            gdg.setipe();
            gdg.setharga();
            
            System.out.println("=======================================");
            System.out.println("");
        }
        else if (menu==2){
            System.out.println("");
            System.out.println("============= Show Data ===============");
            
            plg.getNama();
            plg.getUmur();
            plg.getAlamat();
            
            gdg.getjenis();
            gdg.getmerk();
            gdg.gewarna();
            gdg.getipe();
            gdg.getharga();
            
            System.out.println("=======================================");
            System.out.println("");
        }
        else{
            bts = 2;
        }
        } 
    }    
}
