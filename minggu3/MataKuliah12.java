package minggu3;

import java.util.Scanner;

public class MataKuliah12 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah12(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Constructor default
    public MataKuliah12() {
        
    }

    // Method untuk mengisi data mata kuliah
    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("SKS         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------");
    }

    // Method untuk menampilkan data mata kuliah
    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------");
    }
}
