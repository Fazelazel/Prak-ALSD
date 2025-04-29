package minggu9;

public class Surat12 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat12(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void printSurat() {
        System.out.println("ID: " + idSurat + 
            " | Nama: " + namaMahasiswa + 
            " | Kelas: " + kelas + 
            " | Jenis Izin: " + jenisIzin + 
            " | Durasi: " + durasi + " hari");
    }
}
