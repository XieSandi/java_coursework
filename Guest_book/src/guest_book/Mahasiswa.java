package guest_book;

/**
 *
 * @author Xie
 */

public class Mahasiswa {
    
    public String nama;
    public String alamat;
    public String tlp;
    public String email;
    public int idx;
    
    public Mahasiswa(String nama, String alamat , String tlp , String email){
        
        this.nama = nama;
        this.alamat = alamat;
        this.tlp = tlp;
        this.email = email;
        
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTlp(){
        return tlp;
    }    
    public String getEmail(){
        return email;
    }
    
}

