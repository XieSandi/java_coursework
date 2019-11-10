package kalkulator;
import java.util.Scanner;
/*
 *
 * @author Xie
 * 
 */
public class Kalkulator {

    public static void main(String[] args) {
        
        // Kode mulai disini
        Scanner scan = new Scanner(System.in); //scanner untuk input
        int b,c,d; //inisialisai variable
        int hasil = 0; //hasil = 0 agar tidak eror (sebagai nilai awal
        String op; // insialisasi operasi aritmatik
        
        // prose hitung
        System.out.print("input nilai       : " );
        b = scan.nextInt();
        for(int a=1; a<2;){ // jika a selain 1 maka proses berhenti
            System.out.print("input operasi     : " );
                op = scan.next();
                if ("+".equals(op) ) {
                    System.out.print("input nilai       : " );
                    c = scan.nextInt();
                    hasil = b + c; // proses penjumalahan 
                }
                else if ("-".equals(op) ) {
                    System.out.print("input nilai       : " );
                    c = scan.nextInt();
                    hasil = b - c; // proses pengurangan
                }
                else if ("*".equals(op) ) {
                    System.out.print("input nilai       : " );
                    c = scan.nextInt();
                    hasil = b * c; // proses perkalian 
                }
                else if ("/".equals(op) ) {
                    System.out.print("input nilai       : " );
                    c = scan.nextInt();
                    hasil = b / c; // proses pembagian
                } 
                else {
                    System.out.println("hasil nilai       : "  + hasil );
                    a=a+1; // a ditambah 1 , agar proses berhenti
                    }
                b=hasil; //nilai b sama dengan hasil dari proses
        }
    }
    
}