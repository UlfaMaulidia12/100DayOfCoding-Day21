package ProgramIntegerNumber;

import ProgramTipeDataBoolean.Pajak;
import java.util.Scanner;

public class PajakKode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Buat objek Scanner di sini
        char ulangi;

        do {
            System.out.println("=== Kalkulator Kode Pajak ===");
            Pajak pajak1 = getInputAndCreatePajak("Pajak 1");
            Pajak pajak2 = getInputAndCreatePajak("Pajak 2");

            System.out.println("\n=== Hasil Perhitungan Pajak ===");

            displayPajak(pajak1);
            calculateAndDisplayTax(pajak1);

            displayPajak(pajak2);
            calculateAndDisplayTax(pajak2);

            ulangi = getYesNoInput("Hitung pajak lagi? (Y/N): ");
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close(); // Tutup objek Scanner di sini
        System.out.println("Terima kasih telah menggunakan kalkulator pajak!");
    }

    private static Pajak getInputAndCreatePajak(String message) {
        int kodePajak = getInput(message + " - Masukkan Kode Pajak (1-999): ", 1, 999);
        int persentasePajak = getInput(message + " - Masukkan Persentase Pajak (%): ", 0, 100);
        return new Pajak(kodePajak, persentasePajak);
    }

    private static int getInput(String message, int min, int max) {
        int value;
        // Scanner input = new Scanner(System.in); // Hapus baris ini

        while (true) {
            try {
                System.out.print(message);
                value = input.nextInt(); // Gunakan objek Scanner yang sudah dibuat
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Masukkan angka antara " + min + " dan " + max + ".");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
                input.nextLine(); // Clear the invalid input.
            }
        }
    }

    // Metode lain tidak perlu diubah

    private static void displayPajak(Pajak pajak1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void calculateAndDisplayTax(Pajak pajak1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static char getYesNoInput(String hitung_pajak_lagi_YN_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class input {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void nextLine() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public input() {
        }
    }
}
