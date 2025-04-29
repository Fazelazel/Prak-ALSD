package minggu9;

public class StackSurat12 {
    Surat12[] stack;
    int top;
    int size;

    public StackSurat12(int size) {
        this.size = size;
        stack = new Surat12[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat12 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambah data.");
        } else {
            top++;
            stack[top] = surat;
        }
    }

    public Surat12 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        } else {
            Surat12 surat = stack[top];
            top--;
            return surat;
        }
    }

    public Surat12 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        } else {
            return stack[top];
        }
    }

    public Surat12 searchNama(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }
}
