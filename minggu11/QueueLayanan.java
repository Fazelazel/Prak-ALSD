package minggu11;

public class QueueLayanan {
    Node front, rear;
    int size;
    int max;

    public QueueLayanan(int max) {
        this.max = max;
        this.size = 0;
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return (size == max);
    }

    public void enqueue(Data12 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }
        Node nodeBaru = new Node(mhs);
        if (isEmpty()) {
            front = rear = nodeBaru;
        } else {
            rear.next = nodeBaru;
            rear = nodeBaru;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public Data12 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Data12 mhs = front.data;
        front = front.next;
        size--;
        if (front == null)
            rear = null;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            front.data.tampilkanInformasi();
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            rear.data.tampilkanInformasi();
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        Node temp = front;
        int i = 1;
        while (temp != null) {
            System.out.print(i++ + ". ");
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong");
        } else {
            front = rear = null;
            size = 0;
            System.out.println("Antrian telah dikosongkan");
        }
    }

    public int getSize() {
        return size;
    }
}
