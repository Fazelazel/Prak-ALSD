package minggu7;

import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        DataDosen12 daftar = new DataDosen12(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jk = sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            Dosen12 dsn = new Dosen12(kode, nama, jk, usia);
            daftar.tambah(dsn);
        }

        System.out.println("===== DATA DOSEN =====");
        daftar.tampil();

        System.out.println("Masukkan nama dosen yang ingin dicari: ");
        System.out.print("Nama Dosen : ");
        String cariNama = sc.nextLine();
        System.out.println("--------------------");
        daftar.cariNamaSequential(cariNama);

        daftar.sortUsia();
        System.out.println("Masukkan usia dosen yang ingin dicari: ");
        System.out.print("Usia Dosen : ");
        int cariUsia = sc.nextInt();
        System.out.println("--------------------");
        daftar.cariUsiaBinary(cariUsia, 0, jumlah-1);
    }
}
