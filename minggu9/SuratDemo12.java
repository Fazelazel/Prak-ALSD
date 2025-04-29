package minggu9;

import java.util.Scanner;

public class SuratDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackSurat12 stack = new StackSurat12(10);

        int pilihan;
        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (berdasarkan nama mahasiswa)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    char jenis;
                    do {
                        System.out.print("Jenis Izin (S = sakit, I = izin): ");
                        jenis = sc.nextLine().toUpperCase().charAt(0);
                    } while (jenis != 'S' && jenis != 'I');
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat12 surat = new Surat12(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat12 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.print("Surat diproses: ");
                        diproses.printSurat();
                    }
                    break;
                case 3:
                    Surat12 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.print("Surat Teratas: ");
                        terakhir.printSurat();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    Surat12 hasil = stack.searchNama(cari);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan:");
                        hasil.printSurat();
                    } else {
                        System.out.println("Surat dengan nama tersebut tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
