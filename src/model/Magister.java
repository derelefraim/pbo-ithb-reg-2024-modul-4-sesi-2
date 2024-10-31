package model;
import java.util.LinkedList;

public class Magister extends Mahasiswa{
    

    public Magister(String nama, String telepon, String alamat, String ttl, String nIM, String jurusan,
            LinkedList<MatkulAmbil> mataKuliah, String judulPenelitianTesis) {
        super(nama, telepon, alamat, ttl, nIM, jurusan);
        this.mataKuliah = mataKuliah;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    private LinkedList<MatkulAmbil> mataKuliah = new LinkedList<MatkulAmbil>();
    private String judulPenelitianTesis;
    

    public LinkedList<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(LinkedList<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "mataKuliah=" + mataKuliah + ", judulPenelitianTesis=" + judulPenelitianTesis;
    }
    
    
}
