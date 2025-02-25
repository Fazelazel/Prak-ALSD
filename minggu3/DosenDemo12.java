package minggu3;

import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        // Membuat array of object untuk menyimpan data dosen
        Dosen12[] arrayOfDosen12 = new Dosen12[jumlahDosen];

        // Menggunakan FOR untuk input data dosen
        for (int i=0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode        : ");
            String kode = sc.nextLine();
            System.out.print("Nama Dosen  : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia        : ");
            int usia = Integer.parseInt(sc.nextLine());

            // Menyimpan data dosen ke dalam array of object
            arrayOfDosen12[i] = new Dosen12(kode, nama, jenisKelamin, usia);
            System.out.println("---------------------------------");
        }

        System.out.println("\n===== HASIL ANALSIS DATA DOSEN =====");
        DataDosen12.dataSemuaDosen(arrayOfDosen12);
        DataDosen12.jumlahDosenPerJenisKelamin(arrayOfDosen12);
        DataDosen12.rerataUsiaDosenPerJenisKelamin(arrayOfDosen12);
        DataDosen12.infoDosenPalingTua(arrayOfDosen12);
        DataDosen12.infoDosenPalingMuda(arrayOfDosen12);

        sc.close();
    }
}
