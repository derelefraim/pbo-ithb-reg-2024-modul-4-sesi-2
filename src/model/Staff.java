package model;

public abstract class Staff extends User {
    private String nIK;

    public Staff(String nama, String telepon, String alamat, String ttl, String nIK) {
        super(nama, telepon, alamat, ttl);
        this.nIK = nIK;
    }

    public String getnIK() {
        return nIK;
    }

    public void setnIK(String nIK) {
        this.nIK = nIK;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnIK=" + nIK ;
    }

    
    
}
