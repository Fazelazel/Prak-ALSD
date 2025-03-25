package minggu7;

public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;

    DataDosen12(int jumlah) {
        dataDosen = new Dosen12[jumlah];
    }

    void tambah(Dosen12 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------");
        }
    }

    void cariNamaSequential(String namaCari) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
        System.out.println("Hasil pencarian dosen dengan nama: " + namaCari);
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(namaCari)) {
                dataDosen[i].tampil();
                System.out.println("--------------------");
                ditemukan = true;
                jumlahDitemukan++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + namaCari + " tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu dosen dengan nama \"" + namaCari + "\".");
        }
    }

    void sortUsia() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    int cariUsiaBinary(int cariUsia, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (dataDosen[mid].usia == cariUsia) {
                // Setelah ketemu, tampilkan semua yang punya usia yang sama
                tampilkanSemuaDosenDenganUsia(cariUsia, mid);
                return mid;
            } else if (dataDosen[mid].usia > cariUsia) {
                return cariUsiaBinary(cariUsia, left, mid - 1);
            } else {
                return cariUsiaBinary(cariUsia, mid + 1, right);
            }
        }

        System.out.println("Data dosen dengan usia " + cariUsia + " tidak ditemukan.");
        return -1;
    }

    // Fungsi tambahan untuk menampilkan semua dosen dengan usia yang sama
    void tampilkanSemuaDosenDenganUsia(int usia, int midIndex) {
        int count = 0;
        // Cek ke kiri
        int temp = midIndex;
        while (temp >= 0 && dataDosen[temp].usia == usia) {
            temp--;
        }
        // Start dari sebelah kanan dari index yang ditemukan
        temp++;

        // Cek ke kanan
        while (temp < idx && dataDosen[temp].usia == usia) {
            dataDosen[temp].tampil();
            System.out.println("--------------------");
            temp++;
            count++;
        }

        if (count > 1) {
            System.out.println("Peringatan: Ada " + count + " dosen dengan usia " + usia + ".");
        }
    }

}
