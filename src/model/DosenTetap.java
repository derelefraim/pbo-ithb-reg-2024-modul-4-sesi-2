package model;

import java.util.LinkedList;

public class DosenTetap extends Dosen {
    
    private double salary;
    
    public DosenTetap(String nama, String telepon, String alamat, String ttl, String nIK, String departemen,
            LinkedList<MatkulAjar> listMataKuliah, double salary) {
        super(nama, telepon, alamat, ttl, nIK, departemen, listMataKuliah);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsalary=" + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

}