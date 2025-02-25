package minggu3;

import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa12[] arrayMahasiswa12 = new Mahasiswa12[3];
        String dummy;

        for (int i=0; i < 3; i++) {
            arrayMahasiswa12[i] = new Mahasiswa12();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM    : ");
            arrayMahasiswa12[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayMahasiswa12[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayMahasiswa12[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayMahasiswa12[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        // Menggunakan method cetakInfo() dari class Mahasiswa12
        for (int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayMahasiswa12[i].cetakInfo();
        }

        sc.close();
    }
}
