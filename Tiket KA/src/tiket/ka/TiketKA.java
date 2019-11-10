package tiket.ka;
import java.util.Scanner;
/**
 *
 * @author Xie
 */
public class TiketKA {
    
    public static int ta,tb,tc,jalur,harga;
    static String nama,ktp,asal,tujuan,kelas,tgl,bulan,tahun;
    //int menu;
    Scanner imp = new Scanner(System.in);
    static TiketKA obj = new TiketKA();
    
    int jenis(){
        if ("bandung".equals(asal)){
            if ("jakarta".equals(tujuan)){
                harga = 80000;
            }
            else if ("surabaya".equals(tujuan)){
                harga = 300000;
            }
        }
        else if ("jakarta".equals(asal)){
            if ("bandung".equals(tujuan)){
                harga = 80000;
            }
            else if ("surabaya".equals(tujuan)){
                harga = 360000;
            }   
        }
        else if ("surabaya".equals(asal)){
            if ("bandung".equals(tujuan)){
                harga = 300000;
            }
            else if ("jakarta".equals(tujuan)){
                harga = 360000;
            }   
        }   
    return jalur;
    }
    
    void tipe(){
        if ("eksekutif".equals(kelas)){
            harga = harga +(harga*25/100);
        }
        else{
        }
    } 
    
    void input(){
        System.out.print("Masukan Nama : ");
            nama = imp.next();
        System.out.print("Masukan No KTP : ");
            ktp = imp.next();
        System.out.print("Masukan Asal : ");
            asal = imp.next();
        System.out.print("Masukan tujuan : ");
            tujuan = imp.next();
        System.out.print("Masukan tanggal : ");
            tgl = imp.next();
        System.out.print("Masukan bulan : ");
            bulan = imp.next();
        System.out.print("Masukan Tahun : ");
            tahun = imp.next();
        System.out.print("Masukan kelas : ");
            kelas = imp.next();
        
    }
    
    public static void main(String[] args) {
        
        Scanner imt = new Scanner(System.in);
        
        System.out.println("----- Menu ----");
        System.out.println("1. input data");
        System.out.println("2. tampil data ");
        System.out.println("---------------");
        System.out.println("");
        
        for (int bts=1; bts<2;){
            System.out.print("Masukan Perintah : ");
            int menu = imt.nextInt();
        if (menu==1){
            obj.input();
            obj.jenis();
            obj.tipe();
        }
        else{
        System.out.println("");
        System.out.println("----- Cetak ------");
        System.out.println("Nama    : "+nama);
        System.out.println("Ktp     : "+ktp);
        System.out.println("asal    : "+asal);
        System.out.println("tujuan  : "+tujuan);
        System.out.println("T/B/TH  : "+tgl+" , "+bulan+" , "+tahun);
        System.out.println("Kelas   : "+kelas);
        System.out.println("Harga   : "+harga);
        System.out.println("------------------");
        bts = 2;
        }
        }
        
            
        
        
        
        
        System.out.println("harga : "+harga);
        // TODO code application logic here
    }
    
}
