package model;

public class MatkulPilihan extends MataKuliah {

    private int minMahasiswa;
    
    public MatkulPilihan(String kode, String nama, int sks, int minMahasiswa) {
        super(kode, nama, sks);
        this.minMahasiswa = minMahasiswa;
    }

    public int getMinMahasiswa() {
        return minMahasiswa;
    }

    public void setMinMahasiswa(int minMahasiswa) {
        this.minMahasiswa = minMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minimum Mahasiswa: " + minMahasiswa;
    }
    
}