package minggu12;

import java.util.Scanner;

public class MainQueueVaksin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueVaksin qv = new QueueVaksin();

        int pilih;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Masukkan Nomor Antrian: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    qv.enqueue(no, nama);
                    break;
                case 2:
                    qv.dequeue();
                    break;
                case 3:
                    qv.print();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (pilih != 4);

        sc.close();
    }
}
