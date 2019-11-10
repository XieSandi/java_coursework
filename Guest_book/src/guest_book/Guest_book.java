package guest_book;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Xie
 */
public class Guest_book {

        ArrayList<Mahasiswa> tampil ;
        Scanner imp = new Scanner(System.in);
        Mahasiswa User = new Mahasiswa("","","","");
        static Guest_book tampildata = new Guest_book();
    
    public Guest_book(){
        
        tampil = new ArrayList<>();
    }
    
    public  void isiData(String nama, String alamat , String tlp , String email ){
        
        tampil.add(new Mahasiswa(User.nama,User.alamat,User.tlp,User.email));
        
    }
    
    public  void showData(){
        int pos = 0;
        for(Mahasiswa mhs:tampil){
            System.out.println(pos + " | " + mhs.getNama()+ " | " +mhs.getAlamat() + " | " +mhs.getTlp()+ " | " +mhs.getEmail() );
            pos++;
        }
    }
    
    public void inputData(){
    
        
        System.out.println("Masukan Nama            : ");
        User.nama = imp.nextLine();
        System.out.println("Masukan Alamat          : ");
        User.alamat = imp.nextLine();
        System.out.println("Masukan No Telepon      : ");
        User.tlp = imp.nextLine();
        System.out.println("Masukan Email           : ");
        User.email = imp.nextLine();

        tampildata.isiData(User.nama,User.alamat, User.tlp,User.email);
    }
    
    public void editData(){
        System.out.println("Masukan index            : ");
        int idx= imp.nextInt();
        imp.nextLine();
        
        System.out.println("Masukan Nama            : ");
        User.nama = imp.nextLine();
        System.out.println("Masukan Alamat          : ");
        User.alamat = imp.nextLine();
        System.out.println("Masukan No Telepon      : ");
        User.tlp = imp.nextLine();
        System.out.println("Masukan Email           : ");
        User.email = imp.nextLine();

        tampil.set(idx, User);
    }
    
    public void hapusData(){
        System.out.println("Masukan index            : ");
        int idx= imp.nextInt();
        imp.nextLine();
        
        tampil.remove(idx);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    
      Scanner imt = new Scanner(System.in);
        
        System.out.println("--------- Menu --------");
        System.out.println("1. Input data");
        System.out.println("2. Tampil data ");
        System.out.println("3. Edit data ");
        System.out.println("4. Hapus data ");
        System.out.println("-----------------------");
        
        for (int bts=1; bts<2;){
            System.out.println("");
            System.out.print("Masukan Perintah : ");
            int menu = imt.nextInt();
            System.out.println("");
            switch (menu) {
                case 1:
                    tampildata.inputData();
                    break;
                case 2:
                    tampildata.showData();
                    break;
                case 3:
                    tampildata.editData();
                    break;
                case 4:
                    tampildata.hapusData();
                    break;
                default:
                    bts = 2;
                    break;
            }
        }
  
    }
}
