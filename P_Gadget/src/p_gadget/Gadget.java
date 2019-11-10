/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_gadget;

/**
 *
 * @author Xie Yue
 */


public class Gadget extends Handphone {
    
    //variable 
    public static String jenis , merk , warna , type;
    public static int harga;
    
    Handphone hp = new Handphone("");
    
    public Gadget(String jenis , String merk , String warna ,String Type ,int harga ) {
        super(Type);
        this.jenis = jenis;
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
        this.type = hp.getType();
    }
    
    public String getjenis(){
        this.jenis = jenis;
        System.out.println("Jenis Gadget dibeli    : "+jenis);
        return jenis;
    }
    public String setjenis(){
        System.out.print("Masukan jenis gadget     : ");
        jenis = imp.next();
        return jenis;
    }
    
    public String getmerk(){
        this.merk = merk;
        System.out.println("Merk Gadget dibeli     : "+merk);
        return merk;
    }
    public String setmerk(){
        System.out.print("Masukan merk gadget      : ");
        merk = imp.next();
        return merk;
    }
    
    public String gewarna(){
        this.warna = warna;
        System.out.println("Warna Gadget dibeli    : "+warna);
        return warna;
    }
    public String setwarna(){
        System.out.print("Masukan warna gadget     : ");
        warna = imp.next();
        return warna;
    }
    
    public String getipe(){
        hp.getType();
        return type;
    }
    public String setipe(){
        hp.setType();
        return type;
    }
    
    public int getharga(){
        this.harga = harga;
        System.out.println("Harga Gadget dibeli    : "+harga);
        return harga;
    }
    public int setharga(){
        System.out.print("Masukan harga gadget     : ");
        harga = imp.nextInt();
        return harga;
    }
}
