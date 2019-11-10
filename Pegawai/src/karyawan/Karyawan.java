/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author Xie Yue
 */
public class Karyawan{

    /**
     * @param args the command line arguments
     */
    static class pegawai {
        public void sts(){
            //System.out.println("Saya Adalah pegawai PT.ini");
        };
    };

    static class kurir extends pegawai {
        @Override
        public void sts(){
            System.out.println("Saya Adalah pegawai PT.ini");
            System.out.println("Dengan jabatan Kurir");
        };
    };

    static class manajer extends pegawai {
        @Override
        public void sts(){
            System.out.println("Saya Adalah pegawai PT.ini");
            System.out.println("Dengan jabatan Manajer");
        };
    };

    //public class coba{
        public static void main(String[] args) {
            
            pegawai sandi = new manajer();
            sandi.sts();
        }
    
    }
