package minggu8;

import java.util.Scanner;

public class DataMahasiswa {

    Scanner scanner = new Scanner(System.in);

    Mahasiswa[] mahasiswa = new Mahasiswa[3];
    MataKuliah[] matkul = new MataKuliah[3];
    Penilaian[] nilai = new Penilaian[5];

    DataMahasiswa() {
        mahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        mahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        mahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        matkul[0] = new MataKuliah("MK001", "Struktur Data", 3);
        matkul[1] = new MataKuliah("MK002", "Basis Data", 3);
        matkul[2] = new MataKuliah("MK003", "Desain Web", 3);

        nilai[0] = new Penilaian(mahasiswa[0], matkul[0], 80, 85, 90);
        nilai[1] = new Penilaian(mahasiswa[0], matkul[1], 60, 75, 70);
        nilai[2] = new Penilaian(mahasiswa[1], matkul[0], 75, 70, 80);
        nilai[3] = new Penilaian(mahasiswa[2], matkul[1], 85, 90, 95);
        nilai[4] = new Penilaian(mahasiswa[2], matkul[2], 80, 90, 65);
    }

    void tampilDataMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswa) {
            mhs.tampilMahasiswa();
        }
    }

    void tampilDataMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : matkul) {
            mk.tampilMataKuliah();
        }
    }

    void tampilDataPenilaian() {
        System.out.println("Data Penilaian:");
        for (Penilaian p : nilai) {
            p.tampilPenilaian();
        }
    }

    void urutkanNilaiAkhir() {
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - i - 1; j++) {
                if (nilai[j].nilaiAkhir < nilai[j + 1].nilaiAkhir) {
                    Penilaian temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        tampilDataPenilaian();;
    }

    void cariMahasiswa() {
        System.out.print("Masukkan NIM yang dicari: ");
        String cariNIM = scanner.next();
        boolean ditemukan = false;
        for (Mahasiswa mhs : mahasiswa) {
            if (mhs.nim.equals(cariNIM)) {
                System.out.println("Data Mahasiswa Ditemukan:");
                mhs.tampilMahasiswa();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
        }
    }
}
