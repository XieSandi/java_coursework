/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

/**
 *
 * @author Xie
 */
public class Pesan {
    
    //variable
    public static String menu;
    public static int harga , jumlah , uang , kembali , ttl , qty , jml;
    
    public Pesan(int harga , int jumlah , int ttl , int uang , int kembali ,int qty , int jml, String menu){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.harga = harga;
        this.jumlah = jumlah;
        this.ttl = ttl;
        this.uang = uang;
        this.kembali = kembali;
        this.menu = menu;
        this.qty = qty;
        this.jml = jml;
    }
    
    public String GetMenu(){
        return menu;
    }
    public int GetHarga(){
        return harga;
    }
    public int GetJumlah(){
        return jumlah;
    }
    public int GetTtl(){
        return ttl;
    }
    public int GetUang(){
        return uang;
    }
    public int GetKembali(){
        return kembali;
    }
    
}
