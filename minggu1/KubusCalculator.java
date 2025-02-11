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
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Kalkulator Kubus ===");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.print("Pilih menu (1/2/3): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume kubus: " + hitungVolume(sisi) + "cm^3");
                break;
            case 2:
                System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi) + "cm^2");
                break;
            case 3:
                System.out.println("Keliling kubus: " + hitungKeliling(sisi) + "cm");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

}

