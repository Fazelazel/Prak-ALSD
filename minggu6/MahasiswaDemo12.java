package minggu6;

import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa12 m = new Mahasiswa12(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // System.out.println("\nData Mahasiswa sebelum sorting:");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData Mahasiswa sebelum sorting:");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        // list.selectionSort();
        // list.tampil();

        System.out.println("\nData Mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.insertionSort();
        list.tampil();
    }
}