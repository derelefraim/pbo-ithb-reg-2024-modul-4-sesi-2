package model;

public abstract class Staff extends User {
    private String nIK;

    public Staff(String nama, String telepon, String alamat, String ttl) {
        super(nama, telepon, alamat, ttl);
    }
    
    public String getnIK() {
        return nIK;
    }

    public void setnIK(String nIK) {
        this.nIK = nIK;
    }

    @Override
    public String toString() {
        return super.toString() + "NIK=" + nIK +  "";
    }
    
}
