package minggu11;

public class Mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa12() {
    }

    Mahasiswa12(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
