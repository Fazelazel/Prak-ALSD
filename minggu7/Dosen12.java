package minggu7;

public class Dosen12 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen12(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk.equalsIgnoreCase("L");
        usia = age;
    }

    void tampil() {
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
    }
}
