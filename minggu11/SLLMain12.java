package minggu11;

import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat objek Single Linked List
        SingleLinkedList12 sll = new SingleLinkedList12();
        

        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\nDaftar Mahasiswa:");
        sll.print();

        // // Membuat 4 objek mahasiswa
        // Mahasiswa12 mhs1 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa12 mhs2 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa12 mhs3 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa12 mhs4 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);

        // sll.print(); 
        // sll.addFirst(mhs4); 
        // sll.print(); 
        // sll.addLast(mhs1);
        // sll.print(); 
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print(); 
    
        // System.out.println("data index 1 : ");
        // sll.getData(1);

        // System.out.println("data mahaasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        // System.out.println();

        // sll.removeFirst();
        // sll.removeLast();
        // sll.print();
        // sll.removeAt(0);
        // sll.print();
    }
}
