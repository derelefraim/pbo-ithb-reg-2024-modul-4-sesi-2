package model;

public abstract class Mahasiswa extends User{
    private String nIM, jurusan;
    public Mahasiswa(String nama, String telepon, String alamat, String ttl, String nIM, String jurusan) {
        super(nama, telepon, alamat, ttl);
        this.nIM = nIM;
        this.jurusan = jurusan;
    }

    public String getnIM() {
        return nIM;
    }

    public void setnIM(String nIM) {
        this.nIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "NIM=" + nIM + ", jurusan=" + jurusan;
    }
        
}
