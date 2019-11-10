/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainan;
import java.util.Scanner;

/**
 *
 * @author Xie Yue
 */
public class Permainan{
    
    public static void jalankan(){
        get_game getG = new get_game();
        user usr = new user();
        
        //input
        System.out.println("-------------------------------------------------");
        System.out.println("                Input data anda                  ");
        System.out.println("-------------------------------------------------");
        usr.get_user();
        getG.set_value();
        System.out.println("");
        getG.jenis_game();
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        //output
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("                   Data Anda                     ");
        usr.print_user();
        getG.get_value(getG.hit, getG.miss , getG.g_hit , getG.g_miss , getG.jenis , getG.ket);
        System.out.println("-------------------------------------------------");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Permainan.jalankan(); 
    }   
}
