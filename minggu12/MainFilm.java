package minggu12;

import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {
        DLLFilm list = new DLLFilm();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("==============================");
                    System.out.print("ID Film: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String j1 = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double r1 = sc.nextDouble();
                    list.addFirst(new Film(id1, j1, r1));
                    break;

                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("===============================");
                    System.out.print("ID Film: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String j2 = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double r2 = sc.nextDouble();
                    list.addLast(new Film(id2, j2, r2));
                    break;

                case 3:
                    System.out.println("Masukkan Data Film Urutan ke-:");
                    System.out.println("==============================");
                    System.out.print("ID Film: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String j3 = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double r3 = sc.nextDouble();
                    System.out.print("Film ini akan masuk urutan ke-: ");
                    int idx = sc.nextInt();
                    list.addAtIndex(new Film(id3, j3, r3), idx - 1);
                    break;

                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Hapus posisi ke-: ");
                    int remIdx = sc.nextInt();
                    list.removeAtIndex(remIdx - 1);
                    break;

                case 7:
                    list.printAll();
                    break;

                case 8:
                    System.out.print("Masukkan ID Film: ");
                    int idSearch = sc.nextInt();
                    list.searchById(idSearch);
                    break;

                case 9:
                    list.sortDescendingByRating();
                    System.out.println("Data berhasil diurutkan secara DESC.");
                    list.printAll();
                    break;

                case 10:
                    System.out.println("Terima Kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 10);
    }
}
