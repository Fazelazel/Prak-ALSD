package minggu1;

import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah mata kuliah yang akan dimasukkan
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline setelah nextInt()

        // Deklarasi array untuk menyimpan data
        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        // Menu pilihan pengguna
        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String cariMatkul = scanner.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, cariMatkul);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    // Fungsi menampilkan seluruh jadwal kuliah
    public static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    // Fungsi menampilkan jadwal berdasarkan hari tertentu
    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hari.toUpperCase() + " ===");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah di hari " + hari + ".");
        }
    }

    // Fungsi menampilkan jadwal berdasarkan semester tertentu
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + sem + " ===");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah untuk semester " + sem + ".");
        }
    }

    // Fungsi mencari mata kuliah berdasarkan nama
    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String cariMatkul) {
        System.out.println("\n=== HASIL PENCARIAN MATA KULIAH: " + cariMatkul + " ===");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah '" + cariMatkul + "' tidak ditemukan.");
        }
    }
}

