package zodiac;
import java.util.Scanner;
/**
 *
 * @author Xie
 */
public class Zodiac {

    public static int tanggal,bulan,zod;
    static Zodiac obj = new Zodiac();
    Scanner imp = new Scanner(System.in);
    
    public void zod(){
            //System.out.println("--------------------");
            System.out.print("");
        if ((tanggal>=22 && bulan == 12) || (tanggal<=19 && bulan == 1)){
            System.out.println("Zodiac Anda Capricon");
            zod = 1;
        }
        if ((tanggal>=21 && bulan == 1) || (tanggal<=18 && bulan == 2)){
            System.out.println("Zodiac Anda Aquarius");
            zod = 2;
        }
        if((tanggal>=19 && bulan == 2) || (tanggal<=20 && bulan == 3)){
            System.out.println("Zodiac Anda Pisces");
            zod = 3;
        }
        if((tanggal>=21 && bulan == 3) || (tanggal<=19 && bulan == 4)){
            System.out.println("Zodiac Anda Aries");
            zod = 4;
        }
        if((tanggal>=20 && bulan == 4) || (tanggal<=20 && bulan == 5)){
            System.out.println("Zodiac Anda Taurus");
            zod = 5;
        }
        if((tanggal>=21 && bulan == 5) || (tanggal<=20 && bulan == 6)){
            System.out.println("Zodiac Anda Gemini");
            zod = 6;
        }
        if((tanggal>=21 && bulan == 6) || (tanggal<=22 && bulan == 7)){
            System.out.println("Zodiac Anda Cancer");
            zod = 7;
        }
        if((tanggal>=23 && bulan == 7) || (tanggal<=22 && bulan == 8)){
            System.out.println("Zodiac Anda Leo");
            zod = 8;
        }
        if((tanggal>=23 && bulan == 8) || (tanggal<=22 && bulan == 9)){
            System.out.println("Zodiac Anda Virgo");
            zod = 9;
        }
        if((tanggal>=23 && bulan == 9) || (tanggal<=22 && bulan == 10)){
            System.out.println("Zodiac Anda Libra");
            zod = 10;
        }
        if((tanggal>=23 && bulan == 10) || (tanggal<=21 && bulan == 11)){
            System.out.println("Zodiac Anda Scorpio");
            zod = 11;
        }
        if((tanggal>=22 && bulan == 11) || (tanggal<=21 && bulan == 12)){
            System.out.println("Zodiac Anda Sagitarius");
            zod = 12;
        }
            //System.out.println("----------------------");
    }
    
    void input(){
        System.out.print("Masukan Tanggal : ");
        tanggal = imp.nextInt();
        System.out.print("Masukan Bulan : ");
        bulan = imp.nextInt();
    }
    
    void ramalan(){
        System.out.println("-----------------");
        System.out.println("Ramalan Bulan Ini");
        System.out.println("-----------------");
        
        
        if (zod == 1){
            System.out.println("Anda cocok menjadi Arsitek");
        }
        if (zod == 2){
            System.out.println("Anda cocok menjadi dokter");
        }
        if (zod == 3){
            System.out.println("Anda cocok menjadi Programmer");
        }
        if (zod == 4){
            System.out.println("Anda cocok menjadi Dosen");
        }
        if (zod == 5){
            System.out.println("Anda cocok menjadi Apoteker");
        }
        if (zod == 6){
            System.out.println("Anda cocok menjadi Guru");
        }
        if (zod == 7){
            System.out.println("Anda cocok menjadi Akuntan");
        }
        if (zod == 8){
            System.out.println("Anda cocok menjadi PRO Gamer");
        }
        if (zod == 9){
            System.out.println("Anda cocok menjadi Suster");
        }
        if (zod == 10){
            System.out.println("Anda cocok menjadi idol");
        }
        if (zod == 11){
            System.out.println("Anda cocok menjadi basist");
        }
        if (zod == 12){
            System.out.println("Anda cocok menjadi Penyanyi");
        }
    }
    
    public static void main(String[] args) {
        //obj.input();
        //obj.zod();
        //obj.ramalan();
        
        Scanner imt = new Scanner(System.in);
        
        System.out.println("--------- Menu --------");
        System.out.println("1. Input Tanggal Lahir");
        System.out.println("2. Tampil Zodiac ");
        System.out.println("3. Tampil Ramalan ");
        System.out.println("-----------------------");
        //System.out.println("");
        
        for (int bts=1; bts<2;){
            System.out.println("");
            System.out.print("Masukan Perintah : ");
            int menu = imt.nextInt();
            System.out.println("");
            switch (menu) {
                case 1:
                    obj.input();
                    break;
                case 2:
                    obj.zod();
                    break;
                case 3:
                    obj.ramalan();
                    break;
                default:
                    bts = 2;
                    break;
            }
        }
    
    }
}