package view;

import javax.swing.JOptionPane;
import controller.Controller;

public class View {

    public static void showMenu() {
        boolean running = true;
        String menu = "1. Print UserData\n" +
                      "2. Print Nilai Akhir Mahasiswa\n" +
                      "3. Print Rata-Rata Nilai Akhir\n" +
                      "4. Print Jumlah Mahasiswa Tidak Lulus\n" +
                      "5. Print Mata Kuliah Ambil Mahasiswa\n" +
                      "6. Print Total Jam Mengajar Dosen\n" +
                      "7. Print Gaji Staff\n" +
                      "0. Exit\n" +
                      "Pilih menu:";

        while (running) {
            String input = getInput(menu);
            if (input == null) {
                running = false;
                break;
            }
            int choice = -1;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                showError("Pilihan tidak valid!");
                continue;
            }
            switch (choice) {
                case 1:
                    printUserData();
                    break;
                case 2:
                    printNilaiAkhir();
                    break;
                case 3:
                    printRataRataNilaiAkhir();
                    break;
                case 4:
                    printJumlahTidakLulus();
                    break;
                case 5:
                    printMatkulDiambilMahasiswa();
                    break;
                case 6:
                    printTotalJamMengajar();
                    break;
                case 7:
                    printGaji();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    showError("Pilihan tidak valid!");
            }
        }
    }

    private static String getInput(String message) {
        return JOptionPane.showInputDialog(message);
    }

    private static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static void printUserData() {
        String nama = getInput("Masukkan Nama:");
        if (nama != null) {
            showMessage(Controller.printUserData(nama));
        }
    }

    private static void printNilaiAkhir() {
        String NIM = getInput("Masukkan NIM:");
        if (NIM != null) {
            String kodeMK = getInput("Masukkan Kode Mata Kuliah:");
            if (kodeMK != null) {
                showMessage(Controller.printNilaiAkhir(NIM, kodeMK));
            }
        }
    }

    private static void printRataRataNilaiAkhir() {
        String kodeMK = getInput("Masukkan Kode Mata Kuliah:");
        if (kodeMK != null) {
            showMessage(Controller.printRataRataNilaiAkhir(kodeMK));
        }
    }

    private static void printJumlahTidakLulus() {
        String kodeMK = getInput("Masukkan Kode Mata Kuliah:");
        if (kodeMK != null) {
            showMessage(Controller.printJumlahTidakLulus(kodeMK));
        }
    }

    private static void printMatkulDiambilMahasiswa() {
        String NIM = getInput("Masukkan NIM:");
        if (NIM != null) {
            showMessage(Controller.printMatkulDiambilMahasiswa(NIM));
        }
    }

    private static void printTotalJamMengajar() {
        String NIK = getInput("Masukkan NIK Dosen:");
        if (NIK != null) {
            showMessage(Controller.printTotalJamMengajar(NIK));
        }
    }

    private static void printGaji() {
        String NIK = getInput("Masukkan NIK Staff:");
        if (NIK != null) {
            showMessage(Controller.printGaji(NIK));
        }
    }
}
