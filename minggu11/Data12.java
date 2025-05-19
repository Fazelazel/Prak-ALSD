package minggu11;

public class Data12 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Data12(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + prodi);
    }
}
