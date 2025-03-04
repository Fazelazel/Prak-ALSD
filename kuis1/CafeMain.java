package kuis1;

import java.util.Scanner;

public class CafeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CafeSystem cafe = new CafeSystem();

        // Input nama pelanggan
        cafe.inputNamaPelanggan(scanner);

        // Tampilkan menu dan proses pemesanan
        cafe.tampilkanMenuDanTambahPesanan(scanner);

        while (true) {
            System.out.println("\n=== Sistem Manajemen Cafe ===");
            System.out.println("1. Cek Kode Promo");
            System.out.println("2. Lihat Total Pesanan");
            System.out.println("3. Pilih Metode Pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    cafe.cekKodePromo(scanner);
                    break;
                case 2:
                    cafe.tampilkanPesanan();
                    break;
                case 3:
                    cafe.pilihMetodePembayaran(scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih telah berkunjung.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

