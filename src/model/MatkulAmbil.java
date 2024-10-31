package model;

import java.util.ArrayList;

public class MatkulAmbil {
    
    private MataKuliah matkul;
    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();;
    private int n1;
    private int n2;
    private int n3;
    
    public MatkulAmbil(MataKuliah matkul, ArrayList<Presensi> listPresensi, int n1, int n2, int n3) {
        this.matkul = matkul;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public MataKuliah getMatkul() {
        return matkul;
    }
    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }
    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }
    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN3() {
        return n3;
    }
    public void setN3(int n3) {
        this.n3 = n3;
    }
    @Override
    public String toString() {
        return super.toString() + "matkul=" + matkul + ", listPresensi=" + listPresensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3;
    }

    
}