package model;
import java.util.LinkedList;

public abstract class Dosen extends Staff {
    public Dosen(String nama, String telepon, String alamat, String ttl, String departemen,
            LinkedList<MatkulAjar> listMataKuliah) {
        super(nama, telepon, alamat, ttl);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

    private String departemen;
    private LinkedList<MatkulAjar> listMataKuliah = new LinkedList<MatkulAjar>();

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public LinkedList<MatkulAjar> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(LinkedList<MatkulAjar> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }
    @Override
    public String toString() {
        return super.toString() + "departemen=" + departemen + ", listMataKuliah=" + listMataKuliah;
    }
}
