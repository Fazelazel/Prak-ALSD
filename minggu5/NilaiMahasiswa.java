package minggu5;

public class NilaiMahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    // Constructor
    public NilaiMahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Metode Divide and Conquer untuk mencari indeks nilai UTS tertinggi
    public static int maxUTS(NilaiMahasiswa[] data, int l, int r) {
        if (l == r) {
            return l;
        }
        int mid = (l + r) / 2;
        int maxKiri = maxUTS(data, l, mid);
        int maxKanan = maxUTS(data, mid + 1, r);
        return (data[maxKiri].nilaiUTS > data[maxKanan].nilaiUTS) ? maxKiri : maxKanan;
    }

    // Metode Divide and Conquer untuk mencari indeks nilai UTS terendah
    public static int minUTS(NilaiMahasiswa[] data, int l, int r) {
        if (l == r) {
            return l;
        }
        int mid = (l + r) / 2;
        int minKiri = minUTS(data, l, mid);
        int minKanan = minUTS(data, mid + 1, r);
        return (data[minKiri].nilaiUTS < data[minKanan].nilaiUTS) ? minKiri : minKanan;
    }

    // Metode Brute Force untuk mencari rata-rata nilai UAS
    public static double rataUAS(NilaiMahasiswa[] data) {
        int total = 0;
        for (NilaiMahasiswa mahasiswa : data) {
            total += mahasiswa.nilaiUAS;
        }
        return (double) total / data.length;
    }
}
