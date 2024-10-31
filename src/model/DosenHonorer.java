package model;

import java.util.LinkedList;

public class DosenHonorer extends Dosen {

    private double honorPerSKS;

    public DosenHonorer(String nama, String telepon, String alamat, String ttl, String departemen,
            LinkedList<MatkulAjar> listMataKuliah, double honorPerSKS) {
        super(nama, telepon, alamat, ttl, departemen, listMataKuliah);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + ", Honor per SKS: " + honorPerSKS;
    }
    
}