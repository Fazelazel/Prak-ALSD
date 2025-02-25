package minggu3;

public class Dosen12 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen12(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi dosen
    public void cetakInfo() {
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia + " tahun");
        System.out.println("---------------------------");
    }
}
