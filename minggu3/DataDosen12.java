package minggu3;

public class DataDosen12 {
    
    // Menampilkan data semua dosen
    public static void dataSemuaDosen(Dosen12[] arrayOfDosen12) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen12 dosen : arrayOfDosen12) {
            dosen.cetakInfo();
        }
    }

    // Menampilkan jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen12) {
        int jumlahLaki = 0, jumlahPerempuan = 0;
        for (Dosen12 dosen : arrayOfDosen12) {
            if (dosen.jenisKelamin) {
                jumlahLaki++;
            } else {
                jumlahPerempuan++;
            }
        }
        System.out.println("\n===== JUMLAH DOSEN BEDASARKAN JENIS KELAMIN =====");
        System.out.println("Jumlah Dosen Laki-laki   : " + jumlahLaki);
        System.out.println("Jumlah Dosen Perempuan   : " + jumlahPerempuan);
        System.out.println("---------------------------------");
    }

    // Menampilkan rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen120) {
        int totalUsiaLaki = 0, totalUsiaPerempuan = 0;
        int jumlahLaki = 0, jumlahPerempuan = 0;

        for (Dosen12 dosen : arrayOfDosen120) {
            if (dosen.jenisKelamin) {
                totalUsiaLaki += dosen.usia;
                jumlahLaki++;
            } else {
                totalUsiaPerempuan += dosen.usia;
                jumlahPerempuan++;
            }
        }

        System.out.println("\n===== RATA-RATA USIA DOSEN BERDASARKAN JENIS KELAMIN =====");
        System.out.println("Rata-rata usia dosen laki-laki  : " + (jumlahLaki > 0 ? (double) totalUsiaLaki / jumlahLaki : 0) + " tahun");
        System.out.println("Rata-rata usia dosen perempuan  : " + (jumlahPerempuan > 0 ? (double) totalUsiaPerempuan / jumlahPerempuan : 0) + " tahun");
        System.out.println("------------------------------------");
    }

    // Menampilkan informasi dosen paling tua
    public static void infoDosenPalingTua(Dosen12[] arrayOfDosen12) {
        if (arrayOfDosen12.length == 0) {
            System.out.println("Tidak ada data dosen");
            return;
        }

        Dosen12 dosenTertua = arrayOfDosen12[0];
        for (Dosen12 dosen : arrayOfDosen12) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\n===== DOSEN PALING TUA =====");
        dosenTertua.cetakInfo();
    }

    // Menampilkan informasi dosen paling muda
    public static void infoDosenPalingMuda(Dosen12[] arrayOfDosen12) {
        if (arrayOfDosen12.length == 0) {
            System.out.println("Tidak ada data dosen");
            return;
        }

        Dosen12 dosenTermuda = arrayOfDosen12[0];
        for (Dosen12 dosen : arrayOfDosen12) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\n===== DOSEN PALING MUDA =====");
        dosenTermuda.cetakInfo();
    }
}
