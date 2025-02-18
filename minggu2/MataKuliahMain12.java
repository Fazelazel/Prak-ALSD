package minggu2;

public class MataKuliahMain12 {
    public static void main(String[] args) {
        MataKuliah12 mk1 = new MataKuliah12();
        mk1.kodeMK = "ALSD_TI";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.tampilInformasi();

        MataKuliah12 mk2 = new MataKuliah12("PRAKALSD_TI", "Praktikum Algoritma dan Struktur Data", 3, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
