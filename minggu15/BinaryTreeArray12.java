package minggu15;

public class BinaryTreeArray12 {
    Mahasiswa12[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray12() {
        this.dataMahasiswa = new Mahasiswa12[10];
        this.idxLast = -1; // awalnya kosong
    }

    void populateData (Mahasiswa12 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add (Mahasiswa12 mahasiswa) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = mahasiswa;
        } else {
            System.out.println("Tree sudah penuh, tidak bisa menambah data.");
        }
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi(); 
                traverseInOrder(2 * idxStart + 2); 
            }
        } 
    }

    void traversePreOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); 
                traversePreOrder(2 * idxStart + 1); 
                traversePreOrder(2 * idxStart + 2); 
            }
        } 
    }

}
