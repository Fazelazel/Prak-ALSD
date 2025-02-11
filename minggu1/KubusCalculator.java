package minggu1;

import java.util.Scanner;

public class KubusCalculator {

    public static void main(String[] args) {
        tampilkanMenu();
    }

    // Fungsi untuk menghitung volume kubus
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi untuk menghitung keliling kubus (total panjang rusuk)
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    // Fungsi untuk menampilkan menu dan menerima input dari user
    public static void tampilkanMenu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Kalkulator Kubus ===");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            pilihan = sc.nextInt();

            // Validasi input jika pilihan tidak antara 1-4
            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid! Silakan pilih menu 1, 2, 3, atau 4.");
                continue;
            }

            // Opsi keluar dari program
            if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan kalkulator kubus!");
                break; // Keluar dari loop
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = sc.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume kubus: " + hitungVolume(sisi) + " cm^3");
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi) + " cm^2");
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi) + " cm");
                    break;
            }

        } while (true);
    }

}
