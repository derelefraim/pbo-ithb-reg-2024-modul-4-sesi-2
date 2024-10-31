package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.*;

public class Dummy {

    public static List<User> dummyData() {
        List<User> userList = new ArrayList<>();

        // MataKuliah instance
        MataKuliah stragol = new MataKuliah("112", "Strategi Algoritmik", 4);

        // Presensi instance for students
        ArrayList<Presensi> absen = new ArrayList<>();
        Presensi presensi = new Presensi("12 Oktober 2024", StatusKehadiran.HADIR);
        absen.add(presensi);

        // MatkulAmbil instance
        LinkedList<MatkulAmbil> listMatkul = new LinkedList<>();
        MatkulAmbil matkulAmbil = new MatkulAmbil(stragol, absen, 100, 100, 100);
        listMatkul.add(matkulAmbil);

        // Student instances
        Magister magister = new Magister("Derelq", "0822266914776", "Jl Pisces", "Bandung 2022", "1123029", "Infomatics", listMatkul, "Memperkirakan Harga Bitcoin");
        Sarjana sarjana = new Sarjana("Derel", "0822266914776", "Jl Pisces", "Bandung 2022", "1123029", "Infomatics", listMatkul);
        Doktor doktor = new Doktor("Derel", "0822266914776", "Jl Pisces", "Bandung 2022", "1123029", "Infomatics", "Memperkirakan Harga Bitcoin", 0, 0, 0);

        // Add students to userList
        userList.add(magister);
        userList.add(sarjana);
        userList.add(doktor);

        // PresensiStaff instance for staff
        LinkedList<MatkulAjar> listMatkulAjar = new LinkedList<>();
        List<PresensiStaff> listPresensiStaff = new LinkedList<>();
        PresensiStaff presensiStaff = new PresensiStaff("15 September", StatusKehadiran.HADIR, "09:00");
        listPresensiStaff.add(presensiStaff);

        // MatkulAjar instance
        MatkulAjar matkulAjar = new MatkulAjar(stragol, listPresensiStaff);
        listMatkulAjar.add(matkulAjar);

        // Staff instances
        DosenHonorer dosenHonorer = new DosenHonorer("Mario", "082266914776", "Kopo", "15 September 2005", "001", "Kemahasiswaan", listMatkulAjar, 50000);
        DosenTetap dosenTetap = new DosenTetap("Richie", "0000888222", "Cikaso", "27 Jan 2005", "002", "Keuangan", listMatkulAjar, 20000);
        Karyawan karyawan = new Karyawan("Calvin", "082266914776", "Dago", "24 Mei 2005", "003", 5000000, listPresensiStaff);

        // Add staff to userList
        userList.add(dosenHonorer);
        userList.add(dosenTetap);
        userList.add(karyawan);

        return userList;
    }
}
