package minggu2;

public class Dosen12 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println("Data status berhasil diaktifkan");
        } else {
            System.out.println("Data status berhasil dinonaktifkan");
            
        }
    }

    void hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Sudah mengajar selama " + masaKerja + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi " + bidangKeahlian);
    }

    public Dosen12() {

    }

    public Dosen12(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
