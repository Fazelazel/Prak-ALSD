package minggu8;

public class MataKuliah {
    String kodeMk, namaMk; 
    int sks;

    MataKuliah(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    void tampilMataKuliah() {
        System.out.println("KodeMk : " + kodeMk + " | " + "NamaMk : " + namaMk + " | " + "SKS  : " + sks);
    }
}
