import model.*;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Mahasiswa
        MataKuliah Stragol = new MataKuliah("112", "Strategi Algoritmik", 4);
        LinkedList<MatkulAmbil> listMatkul = new LinkedList<MatkulAmbil>();
        ArrayList<Presensi> absen = new ArrayList <Presensi>();
        
        Presensi presensi = new Presensi("12 Oktober 2024", StatusKehadiran.HADIR);
        absen.add(presensi);
        
        MatkulAmbil matkulambil = new MatkulAmbil(Stragol, absen, 100, 100, 100);
        listMatkul.add(matkulambil);

        Magister magister = new Magister("Derel", "0822266914776", "Jl Pisces", "Bandung 2022", "1123029", "Infomatics", listMatkul, "Memperkirakan Harga Bitcoin");
        Sarjana sarjana = new Sarjana("Derel", "0822266914776", "Jl Pisces", "Bandung 2022", "1123029", "Infomatics", listMatkul);
        Doktor doktor = new Doktor("Derel", "0822266914776", "Jl Pisces", "Bandung 2022", "1123029", "Infomatics", "Memperkirakan harga BItcoin", 0, 0, 0);

        //Staff
        LinkedList <MatkulAjar> listMatkulAjar = new LinkedList<>();
        PresensiStaff presensiStaff = new PresensiStaff("15 September",StatusKehadiran.HADIR, "09:00"); 
        List<PresensiStaff> listPresensiStaff = new LinkedList<PresensiStaff>();
        MatkulAjar matkulAjar = new MatkulAjar(Stragol, listPresensiStaff);
        listMatkulAjar.add(matkulAjar);
        listPresensiStaff.add(presensiStaff);

        DosenHonorer dosenHonorer = new DosenHonorer("Mario","082266914776","Kopo","15 September 2005","Kemahasiswaan",listMatkulAjar, 50000);
        DosenTetap dosenTetap = new DosenTetap("Richie", "0000888222","Cikaso", "27 jan 2005", "Keuangan",listMatkulAjar,20000);        
        Karyawan karyawan =  new Karyawan("Calvin", "082266914776", "Dago", "24 Mei 2005", 5000000, listPresensiStaff);


        //Print
        System.out.println("Mahasiswa Magister \n" + magister.toString() + "\n");
        System.out.println("Mahasiswa Sarjana \n" + sarjana.toString() + "\n");
        System.out.println("Mahasiswa Doktor \n" + doktor.toString() + "\n");

        System.out.println("\n\n");

        System.out.println("Dosen Honorer \n" + dosenHonorer.toString()+ "\n");
        System.out.println("Dosen Tetap \n" +dosenTetap.toString()+ "\n");
        System.out.println("Karyawan \n" +karyawan.toString()+ "\n");
    }
}
