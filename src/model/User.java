package model;

public abstract class User {
    private String nama, telepon, alamat, ttl;

    public User(String nama, String telepon, String alamat, String ttl) {
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
        this.ttl = ttl;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "nama=" + nama + ", telepon=" + telepon + ", alamat=" + alamat + ", ttl=" + ttl + "";
    }
    
}