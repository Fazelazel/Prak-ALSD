package minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        // Data Nilai mahasiswa
        NilaiMahasiswa[] mahasiswa = {
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        // Mencari indeks mahasiswa dengan nilai UTS tertinggi dan terendah
        int indeksMaxUTS = NilaiMahasiswa.maxUTS(mahasiswa, 0, mahasiswa.length - 1);
        int indeksMinUTS = NilaiMahasiswa.minUTS(mahasiswa, 0, mahasiswa.length - 1);

        // Menentukan rata-rata nilai UAS dengan Brute Force
        double rataUAS = NilaiMahasiswa.rataUAS(mahasiswa);

        // Menampilkan hasil
        System.out.println("a) Nilai UTS tertinggi (menggunakan Divide and Conquer):");
        System.out.println("   Nama: " + mahasiswa[indeksMaxUTS].nama);
        System.out.println("   NIM: " + mahasiswa[indeksMaxUTS].nim);
        System.out.println("   Tahun Masuk: " + mahasiswa[indeksMaxUTS].tahunMasuk);
        System.out.println("   Nilai UTS: " + mahasiswa[indeksMaxUTS].nilaiUTS);

        System.out.println("\nb) Nilai UTS terendah (menggunakan Divide and Conquer):");
        System.out.println("   Nama: " + mahasiswa[indeksMinUTS].nama);
        System.out.println("   NIM: " + mahasiswa[indeksMinUTS].nim);
        System.out.println("   Tahun Masuk: " + mahasiswa[indeksMinUTS].tahunMasuk);
        System.out.println("   Nilai UTS: " + mahasiswa[indeksMinUTS].nilaiUTS);

        System.out.printf("\nc) Rata-rata nilai UAS (menggunakan Brute Force): %.2f\n", rataUAS);
    }
}
