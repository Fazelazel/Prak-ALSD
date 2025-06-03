package minggu15;

public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        BinaryTreeArray12 bta = new BinaryTreeArray12();
        Mahasiswa12 mhs1 = new Mahasiswa12("244160121", "Ali", "A", 3.57);
        Mahasiswa12 mhs2 = new Mahasiswa12("244160185", "Candra", "C", 3.41);
        Mahasiswa12 mhs3 = new Mahasiswa12("244160221", "Badar", "B", 3.75);
        Mahasiswa12 mhs4 = new Mahasiswa12("244160220", "Dewi", "B", 3.35);

        Mahasiswa12 mhs5 = new Mahasiswa12("244160131", "Devi", "A", 3.48);
        Mahasiswa12 mhs6 = new Mahasiswa12("244160205", "Ehsan", "D", 3.61);
        Mahasiswa12 mhs7 = new Mahasiswa12("244160170", "Fizi", "B", 3.86);

        Mahasiswa12[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa:");
        bta.traverseInOrder(0);
        System.out.println("\nPreorder Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
