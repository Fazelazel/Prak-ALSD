package minggu1;

import java.util.Scanner;

public class ProgramNilaiAkhir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("============================");
        System.out.print("Masukkan nilai tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int uas = sc.nextInt();
        System.out.println("============================");
        System.out.println("============================");

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("============================");
            System.out.println("============================");
            return;
        }

        double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        
        if (tugas <= 100 && kuis <= 100 && uts <= 100 && uas <= 100) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);

        }

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf : A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf : B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nialai Huruf : B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf : C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf : C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf : D");
        } else if (nilaiAkhir <= 39) {
            System.out.println("Nilai Huruf : E");

        }
        System.out.println("============================");
        System.out.println("============================");
        if (nilaiAkhir > 50) {
            System.out.println("SELAMAT ANDA LULUS  ");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
        sc.close();
    }
}
