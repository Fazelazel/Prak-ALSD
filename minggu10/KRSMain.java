package minggu10;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses 2 Mahasiswa KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Sudah Proses");
            System.out.println("8. Cetak Jumlah Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.palingAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakJumlahSudahProses();
                    break;
                case 8:
                    antrian.cetakBelumProses();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
