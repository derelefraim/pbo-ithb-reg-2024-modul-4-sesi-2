package model;
import java.util.LinkedList;

public class Sarjana extends Mahasiswa{
    
    public Sarjana(String nama, String telepon, String alamat, String ttl, String nIM, String jurusan,
            LinkedList<MatkulAmbil> mataKuliah) {
        super(nama, telepon, alamat, ttl, nIM, jurusan);
        this.mataKuliah = mataKuliah;
    }

    private LinkedList<MatkulAmbil> mataKuliah = new LinkedList<MatkulAmbil>();


    public LinkedList<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(LinkedList<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return super.toString() + "mataKuliah=" + mataKuliah;
    }      
    
}
