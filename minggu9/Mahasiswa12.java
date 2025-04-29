package minggu9;

public class Mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa12(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
