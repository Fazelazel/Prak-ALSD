package minggu14;

public class QueueTransaksi {
    TransaksiPengisian[] transaksiQueue = new TransaksiPengisian[100];
    int front = 0, rear = 0;

    public void tambahTransaksi(TransaksiPengisian transaksi) {
        if (rear < transaksiQueue.length) {
            transaksiQueue[rear++] = transaksi;
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < rear; i++) {
            transaksiQueue[i].tampilkanTransaksi();
        }
    }
}
