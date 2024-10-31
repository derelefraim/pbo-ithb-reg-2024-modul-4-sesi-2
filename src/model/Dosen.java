package model;
import java.util.LinkedList;

public abstract class Dosen extends Staff {
   
    private String departemen;
    private LinkedList<MatkulAjar> listMataKuliah = new LinkedList<MatkulAjar>();
   
    public Dosen(String nama, String telepon, String alamat, String ttl, String nIK, String departemen,
            LinkedList<MatkulAjar> listMataKuliah) {
        super(nama, telepon, alamat, ttl, nIK);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

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

    public int getUnit() {

        int unit = 0;

        for (MatkulAjar matkulAjar : listMataKuliah) {
            for (Presensi presensi : matkulAjar.getPresensiStaff()) {
                if (presensi.isHadir()) {
                    unit++;
                }
            }
        }
        return unit;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen=" + departemen + "\nlistMataKuliah=" + listMataKuliah ;
    }

   
}
