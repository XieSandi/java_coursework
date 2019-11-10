/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainan;

/**
 *
 * @author Xie Yue
 */
public class get_game extends set_game {
   
    @Override
    void get_value(int hit, int miss, int g_hit, int g_miss, String jenis , String ket) {
        System.out.println("Jenis Game           : "+jenis);
        System.out.println("");
        System.out.println("Kena sebanyak        : "+hit);
        System.out.println("Lolos sebanyak       : "+miss);
        System.out.println("");
        System.out.println("Keterangan           : "+ket);
        System.out.println("");
        System.out.println("Poin Kena            : "+g_hit);
        System.out.println("Poin Lolos           : "+g_miss);
    }
}
