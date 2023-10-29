package ProgramLiterals;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PajakKode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            System.out.println("=== Kalkulator Kode Pajak ===");
            Pajak pajak1 = getInputAndCreatePajak("Masukkan Pajak 1");
            Pajak pajak2 = getInputAndCreatePajak("Masukkan Pajak 2");

            System.out.println("\n=== Hasil Perhitungan Pajak ===");

            displayPajak(pajak1);
            calculateAndDisplayTax(pajak1);

            displayPajak(pajak2);
            calculateAndDisplayTax(pajak2);

            ulangi = getYesNoInput("Hitung pajak lagi? (Y/N): ");
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
        System.out.println("Terima kasih telah menggunakan kalkulator pajak!");
    }

    private static Pajak getInputAndCreatePajak(String message) {
        int kodePajak = getInput(message + " - Masukkan Kode Pajak (1-999): ", 1, 999);
        int persentasePajak = getInput(message + " - Masukkan Persentase Pajak (%): ", 0, 100);
        return new Pajak(kodePajak, persentasePajak);
    }

    private static int getInput(String message, int min, int max) {
        int value;
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(message);
                value = input.nextInt();
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

    private static void displayPajak(Pajak pajak) {
        System.out.println("Kode Pajak: " + pajak.getKodePajak());
        System.out.println("Persentase Pajak: " + pajak.getPersentasePajak() + "%");
    }

    private static void calculateAndDisplayTax(Pajak pajak) {
        double calculatedTax = pajak.calculatePajak(); // Hitung jumlah pajak
        DecimalFormat decimalFormat = new DecimalFormat("$#.##");
        System.out.printf("Pajak Kode %d: %s%n", pajak.getKodePajak(), decimalFormat.format(calculatedTax));
    }

    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
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

class Pajak {
    private int kodePajak;
    private int persentasePajak;

    public Pajak(int kodePajak, int persentasePajak) {
        this.kodePajak = kodePajak;
        this.persentasePajak = persentasePajak;
    }

    public int getKodePajak() {
        return kodePajak;
    }

    public int getPersentasePajak() {
        return persentasePajak;
    }

    public double calculatePajak() {
        return (double) kodePajak * persentasePajak / 100;
    }
}
