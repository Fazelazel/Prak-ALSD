package minggu1;

import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input NIM dari pengguna
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine(); // Membaca input NIM sebagai string
        System.out.println("================");

        // Mengambil 2 digit terakhir dari NIM
        int n;
        if (nim.length() >= 2) {
            n = Integer.parseInt(nim.substring(nim.length() - 2)); // Ambil 2 digit terakhir
        } else {
            System.out.println("NIM tidak valid!");
            sc.close();
            return;
        }

        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n); // Menampilkan nilai n

        // Menampilkan deretan bilangan sesuai ketentuan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Skip angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); // Angka genap ditampilkan
            } else {
                System.out.print("* "); // Angka ganjil diganti dengan "*"
            }
        }

        sc.close();
    }
}


