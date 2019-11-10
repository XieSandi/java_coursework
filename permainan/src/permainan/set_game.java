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
abstract class set_game {
    abstract void get_value(int hit , int miss ,int g_hit , int g_miss , String jenis , String ket );
    
    //inisialisasi scanner
    Scanner imp = new Scanner(System.in);
    
    public int hit,miss,idx,g_hit,g_miss;
    public String jenis,ket;
    
    public int set_hit(){
        
        //Input value
        System.out.print("Masukan Hit          : ");
        hit = imp.nextInt();
        return hit;
    };
    
    public int set_miss(){
        
        //Input value
        System.out.print("Masukan Miss         : ");
        miss = imp.nextInt();
        return miss;
    };
    
    public void set_value(){
        set_hit();
        set_miss();
    };
    
    public void jenis_game(){
        System.out.println("Jenis Permainan:");
        System.out.println("1 . Arcade:");
        System.out.println("2 . Strategi:");
        System.out.println("");
        System.out.print("Pilih game             :");
        idx = imp.nextInt();
        switch(idx){
            case 1:
                g_hit = hit*3;
                g_miss = miss*1;
                jenis = "Arcade";
                ket = "Hit x 3 , Miss x 1";
                break;
            case 2:
                g_hit = hit*5;
                g_miss = miss * 2;
                jenis = "Strategi";
                ket = "Hit x 5 , Miss x 2";
                break;
        }
    }
};
