package minggu6;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        DataDosen daftar = new DataDosen(jumlah);

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

            Dosen dsn = new Dosen(kode, nama, jk, usia);
            daftar.tambah(dsn);
        }

        System.out.println("\nData Dosen sebelum sorting:");
        daftar.tampil();

        System.out.println("\nData Dosen setelah sorting ASC (usia termuda ke tertua) menggunakan bubble sort:");
        daftar.bubbleSort();
        daftar.tampil();

        System.out.println("\nData Dosen setelah sorting DSC (usia tertua ke termuda) menggunakan selection sort:");
        daftar.selectionSort();
        daftar.tampil();

        System.out.println("\nData Dosen setelah sorting DSC (usia tertua ke termuda) menggunakan insertion sort:");
        daftar.insertionSort();
        daftar.tampil();
    }
}
