package controller;

import java.util.List;
import model.*;

public class Controller {
    static List<User> listUsers = Dummy.dummyData();

    public static String printUserData(String nama) {
        for (User user : listUsers) {
            System.out.println(user);
            if (user.getNama().equalsIgnoreCase(nama)) {
                return user.toString();
            }
        }
        return "User tidak ditemukan";
    }

    public static String printNilaiAkhir(String NIM, String kodeMK) {
        for (User user : listUsers) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa.getnIM().equals(NIM)) {
                    if (mahasiswa instanceof Sarjana) {
                        Sarjana sarjana = (Sarjana) mahasiswa;
                        for (MatkulAmbil matkulAmbil : sarjana.getMataKuliah()) {
                            if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {
                                double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                                return "Nilai Akhir: " + nilaiAkhir;
                            }
                        }
                    } else if (mahasiswa instanceof Doktor) {
                        Doktor doktor = (Doktor) mahasiswa;
                        double nilaiAkhir = (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3.0;
                        return "Nilai Akhir: " + nilaiAkhir;
                    }
                }
            }
        }
        return "Data tidak ditemukan";
    }

    public static String printRataRataNilaiAkhir(String kodeMK) {
        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        for (User user : listUsers) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) mahasiswa;
                    for (MatkulAmbil matkulAmbil : sarjana.getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {
                            totalNilai += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                            jumlahMahasiswa++;
                        }
                    }
                } else if (mahasiswa instanceof Doktor) {
                    Doktor doktor = (Doktor) mahasiswa;
                    totalNilai += (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3.0;
                    jumlahMahasiswa++;
                }
            }
        }

        if (jumlahMahasiswa == 0) {
            return "Tidak ada mahasiswa yang mengambil matkul ini";
        }

        double rataRata = totalNilai / jumlahMahasiswa;
        return "Rata-Rata Nilai Akhir: " + rataRata;
    }

    public static String printJumlahTidakLulus(String kodeMK) {
        int jumlahTidakLulus = 0;
        int jumlahMahasiswa = 0;
        String namaMK = "";

        for (User user : listUsers) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) mahasiswa;
                    for (MatkulAmbil matkulAmbil : sarjana.getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {
                            namaMK = matkulAmbil.getMatkul().getNama();
                            double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                            if (nilaiAkhir < 56) {
                                jumlahTidakLulus++;
                            }
                            jumlahMahasiswa++;
                        }
                    }
                } else if (mahasiswa instanceof Doktor) {
                    Doktor doktor = (Doktor) mahasiswa;
                    double nilaiAkhir = (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3.0;
                    if (nilaiAkhir < 56) {
                        jumlahTidakLulus++;
                    }
                    jumlahMahasiswa++;
                }
            }
        }

        return "<" + jumlahTidakLulus + "> dari <" + jumlahMahasiswa + "> mahasiswa tidak lulus matakuliah <" + namaMK + ">";
    }

    public static String printMatkulDiambilMahasiswa(String NIM) {
        for (User user : listUsers) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa.getnIM().equals(NIM)) {
                    if (mahasiswa instanceof Sarjana) {
                        Sarjana sarjana = (Sarjana) mahasiswa;
                        String result = "Matkul Diambil: ";
                        for (MatkulAmbil matkulAmbil : sarjana.getMataKuliah()) {
                            result += matkulAmbil.getMatkul().getNama() + " (Total Presensi: " + matkulAmbil.getListPresensi().size() + "), ";
                        }
                        return result;
                    } else {
                        return "Mahasiswa bukan dari program Sarjana";
                    }
                }
            }
        }
        return "Mahasiswa tidak ditemukan";
    }

    public static String printTotalJamMengajar(String nIK) {
        for (User user : listUsers) {
            if (user instanceof Dosen) {
                Dosen dosen = (Dosen) user;
                if (dosen.getnIK().equals(nIK)) {
                    int totalJamMengajar = 0;
                    for (MatkulAjar matkulAjar : dosen.getListMataKuliah()) {
                        for (Presensi presensi : matkulAjar.getPresensiStaff()) {
                            if (presensi.getStatus() == StatusKehadiran.HADIR) {
                                totalJamMengajar += matkulAjar.getMatkul().getSks();
                            }
                        }
                    }
                    return "Total Jam Mengajar: " + totalJamMengajar;
                }
            }
        }
        return "Dosen tidak ditemukan";
    }

    public static String printGaji(String nIK) {
        for (User user : listUsers) {
            if (user instanceof Karyawan) {
                Karyawan karyawan = (Karyawan) user;
                if (karyawan.getnIK().equals(nIK)) {
                    int unit = karyawan.getUnit();
                    double gaji = karyawan.getSalary() * (unit / 22.0);
                    return "Gaji Karyawan: " + gaji;
                }
            } else if (user instanceof DosenTetap) {
                DosenTetap dosenTetap = (DosenTetap) user;
                if (dosenTetap.getnIK().equals(nIK)) {
                    int unit = dosenTetap.getUnit();
                    double gaji = dosenTetap.getSalary() + (unit * 25000);
                    return "Gaji Dosen Tetap: " + gaji;
                }
            } else if (user instanceof DosenHonorer) {
                DosenHonorer dosenHonor = (DosenHonorer) user;
                if (dosenHonor.getnIK().equals(nIK)) {
                    int unit = dosenHonor.getUnit();
                    double gaji = unit * dosenHonor.getHonorPerSKS();
                    return "Gaji Dosen Honor: " + gaji;
                }
            }
        }
        return "User tidak ditemukan";
    }
}
