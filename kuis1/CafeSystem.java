package kuis1;

import java.util.Scanner;

// Kelas untuk menampilkan item menu di kafe
class MenuItem {
    String nama;
    double harga;

    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

// Kelas utama untuk sistem informasi kafe
public class CafeSystem {
    private static MenuItem[] menu = {
        new MenuItem("Espresso", 15000),
        new MenuItem("Cappuccino", 20000),
        new MenuItem("Latte", 25000),
        new MenuItem("Mocha", 30000)
    };

    private int[] pesanan;
    private String namaPelanggan;
    private double diskon;

    public CafeSystem() {
        pesanan = new int[menu.length]; // Menyimpan jumlah pesanan per item
        this.diskon = 0;
    }

    public void inputNamaPelanggan(Scanner scanner) {
        System.out.print("Masukkan nama pelanggan: ");
        this.namaPelanggan = scanner.nextLine();
        System.out.println("\nSelamat datang, " + namaPelanggan + " !");
    }

    public void tampilkanMenuDanTambahPesanan(Scanner scanner) {
        while (true) {
            System.out.println("\n=== Menu Cafe ===");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].nama + " - Rp " + menu[i].harga);
            }
            
            System.out.print("Apakah Anda ingin memesan? (iya/tidak): ");
            String jawaban = scanner.next();
            
            if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("Terima kasih telah mengunjungi kafe kami. Sampai jumpa!");
                break;
            } else if (jawaban.equalsIgnoreCase("iya")) {
                System.out.print("Pilih nomor menu yang ingin dipesan: ");
                int pilihan = scanner.nextInt();
                if (pilihan < 1 || pilihan > menu.length) {
                    System.out.println("Pilihan tidak valid!");
                    continue;
                }
                System.out.print("Masukkan jumlah: ");
                int jumlah = scanner.nextInt();
                pesanan[pilihan - 1] += jumlah;
                System.out.println("Pesanan berhasil ditambahkan.");
            } else {
                System.out.println("Input tidak valid, silakan ulangi.");
            }
            
            System.out.print("Apakah Anda ingin memesan item lain? (iya/tidak): ");
            String lanjutPesan = scanner.next();
            if (lanjutPesan.equalsIgnoreCase("tidak")) {
                break;
            }
        }
    }

    public void cekKodePromo(Scanner scanner) {
        System.out.print("Masukkan kode promo: ");
        String kode = scanner.next();
        if (kode.equalsIgnoreCase("DISKON10")) {
            diskon = 0.10;
            System.out.println("Kode promo berhasil digunakan! Diskon 10% diterapkan.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
    }

    public void tampilkanPesanan() {
        System.out.println("\n=== Pesanan Anda ===");
        double total = 0;
        boolean adaPesanan = false;
        for (int i = 0; i < menu.length; i++) {
            if (pesanan[i] > 0) {
                adaPesanan = true;
                double subtotal = pesanan[i] * menu[i].harga;
                System.out.println(menu[i].nama + " x " + pesanan[i] + " = Rp " + subtotal);
                total += subtotal;
            }
        }
        if (!adaPesanan) {
            System.out.println("Belum ada pesanan.");
        } else {
            double totalSetelahDiskon = total - (total * diskon);
            System.out.println("Total sebelum diskon: Rp " + total);
            if (diskon > 0) {
                System.out.println("Diskon: " + (diskon * 100) + "%");
            }
            System.out.println("Total setelah diskon: Rp " + totalSetelahDiskon);
        }
    }

    public void pilihMetodePembayaran(Scanner scanner) {
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit/Debit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih pembayaran Tunai.");
                break;
            case 2:
                System.out.println("Anda memilih pembayaran Kartu Kredit/Debit.");
                break;
            case 3:
                System.out.println("Anda memilih pembayaran E-Wallet.");
                break;
            default:
                System.out.println("Pilihan tidak valid, silakan ulangi.");
        }
    }
}
