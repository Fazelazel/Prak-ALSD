package minggu10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size;
    final int max = 10;
    int sudahProses = 0;
    final int maxProses = 30;

    public AntrianKRS() {
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian sudah dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void prosesKRS() {
        if (size < 2) { //validasi jumlah antrian harus lebih dari 2
            System.out.println("Antrian kurang dari 2, tidak bisa memproses KRS.");
            return;
        }

        if (sudahProses + 2 > maxProses) { //validasi kuota proses KRS
            System.out.println("Kuota proses KRS oleh DPA telah mencapai batas maksimal.");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void palingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah dalam antrian: " + size);
    }

    public void cetakJumlahSudahProses() {
        System.out.println("Jumlah sudah proses KRS: " + sudahProses);
    }

    public void cetakBelumProses() {
        int belum = maxProses - sudahProses;
        System.out.println("Jumlah mahasiswa belum proses KRS: " + belum);
    }
}
