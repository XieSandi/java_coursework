/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_gadget;

import java.util.Scanner;

/**
 *
 * @author Xie Yue
 */
public class Handphone {
    
    //objek
    Scanner imp = new Scanner(System.in);
    
    //variable
    public static String Type;

    public Handphone(String Type){
    this.Type = Type;
    }
    
    public String getType(){
        this.Type = Type;
        System.out.println("Tipe Gadget dibeli     : "+Type);
        return Type;
    }
    public String setType(){
        System.out.print("Masukan tipe Handphone   : ");
        Type = imp.next();
        return Type;
    }
}
