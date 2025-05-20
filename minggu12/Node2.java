package minggu12;

public class Node2 {
    int nomor;
    String nama;
    Node2 prev, next;

    Node2 (Node2 prev, int nomor, String nama, Node2 next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
