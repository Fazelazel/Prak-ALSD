package minggu8;

import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataMahasiswa data = new DataMahasiswa();
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    data.tampilDataMahasiswa();
                    break;
                case 2:
                    data.tampilDataMataKuliah();
                    break;
                case 3:
                    data.tampilDataPenilaian();
                    break;
                case 4:
                    data.urutkanNilaiAkhir();
                    break;
                case 5:
                    data.cariMahasiswa();
                    break;

            }
        } while (pilihan != 0);
    }
}
