package minggu1;

public class RoyalGarden {
    public static void main(String[] args) {
        tampilkanPendapatanCabang();
        tampilkanTotalStokBunga();
    }

    // Data stok bunga pada tiap cabang
    static int[][] stock = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    // Harga masing-masing bunga
    static int[] harga = { 75000, 50000, 60000, 10000 };

    // Fungsi untuk menampilkan pendapatan tiap cabang
    public static void tampilkanPendapatanCabang() {
        System.out.println("Pendapatan Setiap Cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    // Fungsi untuk menampilkan total stok setiap jenis bunga
    public static void tampilkanTotalStokBunga() {
        System.out.println("\nTotal Stok Setiap Jenis Bunga di Semua Cabang:");
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        for (int j = 0; j < harga.length; j++) {
            int totalStok = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStok += stock[i][j];
            }
            System.out.println(namaBunga[j] + ": " + totalStok);
        }
    }
}
