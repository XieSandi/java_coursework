/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket.stadion;

/**
 *
 * @author Xie
 */
public class Pesan {
    
    //variable
    public static String menu , nama;
    public static int harga , tgl , kelas , bangku;
    
    public Pesan(String nama , int harga , int tgl , int kelas ,  int bangku, String menu){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.harga  = harga;
        this.nama   = nama;
        this.tgl    = tgl;
        this.kelas  = kelas;
        this.bangku = bangku;
        this.menu   = menu;

    }
    
    public String GetMenu(){
        return menu;
    }
    public int GetHarga(){
        return harga;
    }
    public String GetNama(){
        return nama;
    }
    public int GetTgl(){
        return tgl;
    }
    public int GetKelas(){
        return kelas;
    }
    public int GetBangku(){
        return bangku;
    }
    
}
