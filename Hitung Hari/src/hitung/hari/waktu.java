/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung.hari;

/**
 *
 * @author Xie
 */
public class waktu {
    String[] hari = {"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
    int[] b31 = {1,3,5,7,8,10,12};
    int[] b30 = {4,6,9,11};
    int[] b2 = {2};
    int kbs,feb;

    void kabisat(){
        if (kbs % 4 == 0){
            if (kbs % 100 == 0){
                if (kbs % 400 == 0){
                    feb = 29;
                }
                else{
                    feb = 28;
                }
            }
            else{
                feb = 29;
            }
        }
        else{
            feb = 28;
        }
    }
    
    void hitung(){
        hb3 = b31[0;
        int ;1,2,3,4,5,6];
    }
}
