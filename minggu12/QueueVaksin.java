package minggu12;

public class QueueVaksin {
    Node2 head, tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int nomor, String nama) {
        if (isEmpty()) {
            head = tail = new Node2(null, nomor, nama, null);
        } else {
            Node2 newNode = new Node2(tail, nomor, nama, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian untuk divaksin.");
            return;
        }
        System.out.println(head.nama + " telah selesai divaksinasi.");
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null;
        size--;
    }

    public void print() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++++++++");
        Node2 tmp = head;
        int no = 1;
        while (tmp != null) {
            System.out.printf("%d.\t%d\t%s\n", no++, tmp.nomor, tmp.nama);
            tmp = tmp.next;
        }
        System.out.println("Sisa Antrian: " + size);
        System.out.println();
    }
}
