package minggu2;

public class DosenMain12 {
    public static void main(String[] args) {
        Dosen12 dosen1 = new Dosen12();
        dosen1.idDosen = "D001";
        dosen1.nama = "Prof. Alfreda";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Sistem Informasi";
        dosen1.tampilkanInformasi();
        System.out.println("==========================");
        System.out.println("Sudah mengajar selama " + dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println("==========================");

        Dosen12 dosen2 = new Dosen12("D002", "Dr. Nabil", false, 2015, "Web Programming");
        dosen2.tampilkanInformasi();
        System.out.println("==========================");
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Mobile Programming");
        System.out.println("==========================");
        dosen2.tampilkanInformasi();
        System.out.println("==========================");
        System.out.println("Sudah mengajar selama " + dosen2.hitungMasaKerja(2025) + " tahun");
        System.out.println("==========================");
    }
}
