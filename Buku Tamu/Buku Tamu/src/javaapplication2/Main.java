/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //konstraktor = new konstraktor();
        //User sandi;
        Scanner imp = new Scanner(System.in);
        Konstraktor User = new Konstraktor("","","","");
        //ArrayList<String> Mhs = new ArrayList<String>();
        
        ArrayList<Konstraktor> data ;
         
        data = new ArrayList<Konstraktor>();
        //data.add(new User(nama,alamat,email,tlp));
       
 
        
        System.out.println("Masukan Nama            : ");
        User.nama = imp.nextLine();
        System.out.println("Masukan Alamat          : ");
        User.alamat = imp.nextLine();
        System.out.println("Masukan No Telepon      : ");
        User.tlp = imp.nextLine();
        System.out.println("Masukan Email           : ");
        User.email = imp.nextLine();

        String getnama = User.nama;
        String getalamat = User.nama;
        //System.out.println("");
        //System.out.println("========================");
        //System.out.println("");

        //System.out.println("Nama    : " + User.nama);
        //System.out.println("Alamat  : " + User.alamat);
        //System.out.println("No telp : " + User.tlp);
        //System.out.println("Email   : " + User.email);
        
        Mhs.add(getnama);
        
        for (String data : Mhs) {
         System.out.println("Mahasiswa = " + Mhs);
      }  
    }
    }


