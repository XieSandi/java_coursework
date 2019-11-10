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
public class user {
    Scanner imp = new Scanner(System.in);
    
    public String nama , kategori;
    public int level;
    
    public void set_nama(){
        
        //Input value
        System.out.print("Masukan Nama         : ");
        nama = imp.next();
    };
    
        public int set_level(){
        
        //Input value
        System.out.print("Masukan level(1-100) : ");
        level = imp.nextInt();
        
        //percabangan
        if (level <= 20){
            kategori = "Normal";
        }
        else if(level <= 80){
            kategori = "Medium";
        }
        else if(level <=100){
            kategori = "Hard";
        }
        else{System.out.println("ERROR");}
        
        return level;
    };
    
    public void get_user(){
        set_nama();
        set_level();
    };
        
    public void print_user(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nama anda            : "+nama);
        System.out.println("Level anda           : "+level);
        System.out.println("Kategori level       : "+kategori);
        System.out.println("-------------------------------------------------");
    };
}
