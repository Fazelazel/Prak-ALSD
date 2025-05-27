package minggu14;

public class AntrianKendaraan {
    Node head, tail;

    public void tambahAntrian(Kendaraan k) {
        Node baru = new Node(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public Kendaraan layaniKendaraan() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Kendaraan dilayani = head.data;
        head = head.next;
        if (head == null) tail = null;
        return dilayani;
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("-- Antrian kosong --");
            return;
        }
        System.out.println("-- Antrian Kendaraan --");
        Node temp = head;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public int jumlahAntrian() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

