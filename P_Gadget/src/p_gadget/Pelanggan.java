/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_gadget;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Xie Yue
 */
public class Pelanggan {
    
    //variable
    public static String nama , alamat;
    public static int id , umur;
    
    Scanner imp = new Scanner(System.in);
    
    public Pelanggan(int id , String nama , int umur , String alamat){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public String getNama(){
        this.nama = nama;
        System.out.println("Nama Pelanggan         : "+nama);
        return nama;
    }
    public String setNama(){
        System.out.print  ("Masukan nama Pelanggan   : ");
        nama = imp.next();
        return nama;
    }
    public int getUmur(){
        this.umur = umur;
        System.out.println("Umur Pelanggan         : "+umur);
        return umur;
    }
    public int setUmur(){
        System.out.print  ("Masukan umur Pelanggan   : ");
        umur = imp.nextInt();
        return umur;
    }
    public String getAlamat(){
        this.alamat = alamat;
        System.out.println("Alamat Pelanggan       : "+alamat);
        return alamat;
    }
    public String setAlamat(){
        System.out.print  ("Masukan alamat Pelanggan : ");
        alamat = imp.next();
        return alamat;
    }
    
}
