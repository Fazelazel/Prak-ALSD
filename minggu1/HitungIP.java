package minggu1;

import java.util.Scanner;

public class HitungIP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 }; // SKS masing-masing mata kuliah
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            // Konversi nilai angka ke huruf dan bobot nilai
            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        // Menghitung IP Semester
        double ipSemester = (totalSKS == 0) ? 0 : totalBobot / totalSKS;

        // Menampilkan hasil konversi
        System.out.println("\n=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");
        System.out.printf("%-35s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-12.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    bobotNilai[i]);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.printf("IP Semester : %.2f\n", ipSemester);
        System.out.println("=================================");

        sc.close();
    }
}
