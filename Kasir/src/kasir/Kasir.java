package kasir;

import java.util.Scanner;

/**
 *
 * @author Xie
 */

public class Kasir extends Pesan {

    /**
     * @param args the command line arguments
     */
    
    Scanner imp = new Scanner(System.in);
    static Kasir objek = new Kasir(0,0,0,0,0,0,0,"");
    
    public  Kasir(int harga, int jumlah, int ttl, int uang, int kembali,int qty , int jml,String menu) {
        super(harga, jumlah, ttl, uang, kembali , qty , jml , menu);
        jml = qty * harga;
    }
   
    
    
     void menu(){
        System.out.println("--------- Pilihan Menu Paket Makanan ----------");
        System.out.println("");
        System.out.println("1. Paket Ayam Goreng Sambal Matah    (Rp 25000)");
        System.out.println("2. Paket Ayam Surundeng              (Rp 30000)");
        System.out.println("3. Paket Ayam Geprek                 (Rp 35000)");
        System.out.println("4. Paket Kombo Ayam Special 1        (Rp 40000)");
        System.out.println("5. Paket Kombo Ayam Special 2        (Rp 45000)");
        System.out.println("");
        //System.out.println("");
        
        System.out.print("Pilih Menu : ");
        int kode = imp.nextInt();
        System.out.print("Jumlah     : ");
        qty = imp.nextInt();
        
        
        switch (kode) {
            case 1:
                harga = 25000;
                jml = harga*qty;
                menu = "Paket Ayam Goreng Sambal Matah";
                break;
            case 2:
                harga = 30000;
                jml = harga*qty;
                menu = "Paket Ayam Surundeng";
                break;
            case 3:
                harga = 35000;
                jml = harga*qty;
                menu = "Paket Ayam Geprek";
                break;
            case 4:
                harga = 40000;
                jml = harga*qty;
                menu = "Paket Kombo Ayam Special 1";
                break;
            case 5:
                harga = 45000;
                jml = harga*qty;
                menu = "Paket Kombo Ayam Special 2";
                break;
            default:
                harga = 0;
                break;
        }
        
    };
    
     void input(){
        System.out.print("Transfer Uang : ");
        uang = imp.nextInt();
        System.out.print("");
        
        if (uang == jml){
            System.out.print("");
            System.out.println("Uang Anda Cukup");
            System.out.println("Silahkan Ambil Struk");
        }
        else if (uang < jml){
            for (int cukup = 0;cukup<1;){
                if (uang < jml){
                    int min = jml-uang;
                    System.out.println("Uang Anda Kurang "+min);
                    System.out.print("Transfer kembali : ");
                    ttl = imp.nextInt();
                    uang = uang + ttl;
                }
                else if (uang == jml){
                    System.out.print("");
                    System.out.println("Uang Anda Cukup");
                    System.out.println("Silahkan Ambil Struk");
                    cukup = 1;
                }    
                else if (uang > jml){
                    kembali = uang - jml;
                    System.out.print("");
                    System.out.println("Uang Anda Lebih");
                    System.out.println("Kembalian Anda : "+kembali);
                    System.out.println("Silahkan Ambil Struk");
                    cukup = 1;
                }
                else if (uang < 0){
                    System.out.println("Uang Anda negatif");
                    System.out.print("Transfer kembali : ");
                    uang = imp.nextInt();
                }
                else{  
                }
            }
        }
        else if (uang > jml){
            kembali = uang - jml;
            System.out.print("");
            System.out.println("Uang Anda Lebih");
            System.out.println("Kembalian Anda : "+kembali);
            System.out.println("Silahkan Ambil Struk");
        }
        else{
        }
    }
     
    public static void main(String[] args) {
        // TODO code application logic 
        
        objek.menu();
        
        System.out.println("");
        System.out.println("Menu Anda    = "+menu);
        System.out.println("Harga        = "+harga);
        System.out.println("Jumlah       = "+qty);
        System.out.println("Total Harga  = "+jml);
        System.out.println("");
        
        objek.input();
    }
    
}
