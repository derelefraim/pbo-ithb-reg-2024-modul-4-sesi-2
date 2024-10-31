package model;

import java.util.List;

public class Karyawan extends Staff {
    
    private double salary;
    private List<PresensiStaff> listPresensiStaff;
    public Karyawan(String nama, String telepon, String alamat, String ttl, String nIK, double salary,
            List<PresensiStaff> listPresensiStaff) {
        super(nama, telepon, alamat, ttl, nIK);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }
    public void setListPresensiStaff(List<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    public int getUnit() {
        int unit = 0;
        for (Presensi presensi : listPresensiStaff) {
            if (presensi.isHadir()) {
                unit++;
            }
        }
        return unit;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsalary=" + salary + "\nlistPresensiStaff=" + listPresensiStaff;
    }

    
}