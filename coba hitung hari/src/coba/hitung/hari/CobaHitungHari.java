/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.hitung.hari;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Xie
 */
public class CobaHitungHari {

   public static int getDifferenceDays(Date d1, Date d2) {
        int daysdiff=0;
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000)+1;
        daysdiff = (int) diffDays;
        return daysdiff;
   }
   
    public static void main(String[] args) throws ParseException {
        String dateStart = "28/07/2000";
        String dateStop =  "27/2/2019";

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Date d1 = format.parse(dateStart);
        Date d2 = format.parse(dateStop);

        System.out.println("Anda lahir pada tahun : "+dateStart);
        System.out.println("Tanggal hari ini : "+dateStop);
        System.out.println("Anda telah hidup selama " + getDifferenceDays(d1,d2) + " Hari");
    }
    
}
