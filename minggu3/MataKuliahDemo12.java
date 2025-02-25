package minggu3;

import java.util.Scanner;

public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input user untuk jumlah data mata kuliah
        System.out.print("Masukkan jumlah data mata kuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        // Membuat array sesuai input user
        MataKuliah12[] arrayOfMataKuliah12 = new MataKuliah12[jumlahMatkul];

        // Mengisi data mata kuliah
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah12[i] = new MataKuliah12();
            arrayOfMataKuliah12[i].tambahData();
        }

        // Menampilkan data mata kuliah
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah12[i].cetakInfo();
        }
    }
}
