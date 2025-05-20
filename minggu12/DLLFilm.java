package minggu12;

public class DLLFilm {
    Node3 head, tail;

    public void addFirst(Film film) {
        Node3 newNode = new Node3(film);
        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Film film) {
        Node3 newNode = new Node3(film);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(Film film, int index) {
        if (index == 0) {
            addFirst(film);
        } else {
            Node3 newNode = new Node3(film);
            Node3 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                addLast(film);
            } else {
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void removeFirst() {
        if (head == null)
            return;
        if (head == tail)
            head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (tail == null)
            return;
        if (head == tail)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAtIndex(int index) {
        if (index == 0)
            removeFirst();
        else {
            Node3 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current != null && current != tail) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            } else if (current == tail) {
                removeLast();
            }
        }
    }

    public void printAll() {
        Node3 current = head;
        while (current != null) {
            System.out.println("ID: " + current.data.id);
            System.out.println("Judul Film: " + current.data.judul);
            System.out.println("Rating: " + current.data.rating);
            current = current.next;
        }
    }

    public void searchById(int id) {
        Node3 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("Data ID Film: " + id + " berada di node ke- " + (index + 1));
                System.out.println("IDENTITAS:");
                System.out.println("ID: " + current.data.id);
                System.out.println("Judul Film: " + current.data.judul);
                System.out.println("IMDB Rating: " + current.data.rating);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data ID Film " + id + " tidak ditemukan.");
    }

    public void sortDescendingByRating() {
        if (head == null || head.next == null)
            return;
        for (Node3 i = head; i != null; i = i.next) {
            for (Node3 j = i.next; j != null; j = j.next) {
                if (i.data.rating < j.data.rating) {
                    Film temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
}
