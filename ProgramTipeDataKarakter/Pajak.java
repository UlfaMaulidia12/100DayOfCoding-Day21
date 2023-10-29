package ProgramTipeDataKarakter;

import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        int percobaan = 0;

        do {
            System.out.println("=== Program Jenis Kelamin ===");

            char jenisKelamin = getGenderInput(input, "Masukkan Jenis Kelamin Anda (L/P): ");

            if (jenisKelamin == 'L') {
                System.out.println("Anda adalah seorang Laki-laki.");
            } else if (jenisKelamin == 'P') {
                System.out.println("Anda adalah seorang Perempuan.");
            } else {
                System.out.println("Jenis kelamin tidak valid. Silakan masukkan 'L' atau 'P'.");
            }

            ulangi = getYesNoInput(input, "Ingin memasukkan jenis kelamin lagi? (Y/N): ");

            percobaan++;
            if (percobaan >= 3) {
                System.out.println("Anda telah mencoba sebanyak 3 kali. Keluar dari program.");
                break;
            }
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
        System.out.println("Terima kasih telah menggunakan program Jenis Kelamin!");
    }

    private static char getGenderInput(Scanner input, String message) {
        char jenisKelamin;
        while (true) {
            System.out.print(message);
            jenisKelamin = input.next().charAt(0);
            if (isValidGender(jenisKelamin)) {
                return jenisKelamin;
            } else {
                System.out.println("Jenis kelamin tidak valid. Silakan masukkan 'L' atau 'P'.");
            }
        }
    }

    private static boolean isValidGender(char jenisKelamin) {
        return jenisKelamin == 'L' || jenisKelamin == 'P';
    }

    private static char getYesNoInput(Scanner input, String message) {
        char response;
        while (true) {
            System.out.print(message);
            response = input.next().charAt(0);
            if (response == 'Y' || response == 'y' || response == 'N' || response == 'n') {
                return response;
            } else {
                System.out.println("Pilihan tidak valid. Masukkan 'Y' atau 'N'.");
            }
        }
    }
}
