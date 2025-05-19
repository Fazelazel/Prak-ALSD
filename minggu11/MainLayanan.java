package minggu11;

import java.util.Scanner;

public class MainLayanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLayanan antrian = new QueueLayanan(5);
        int pilihan;

        do {
            System.out.println("\n========= MENU ANTRIAN LAYANAN =========");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Lihat Jumlah Mahasiswa Dalam Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Data12 mhs = new Data12(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    Data12 dipanggil = antrian.dequeue();
                    if (dipanggil != null) {
                        System.out.println("Mahasiswa dipanggil:");
                        dipanggil.tampilkanInformasi();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.lihatTerakhir();
                    break;

                case 5:
                    antrian.tampilkanAntrian();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;

                case 7:
                    antrian.kosongkanAntrian();
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
