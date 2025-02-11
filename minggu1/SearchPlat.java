package minggu1;

import java.util.Scanner;

public class SearchPlat {
    public static void main(String[] args) {
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' }, // A - BANTEN
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' }, // B - JAKARTA
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' }, // D - BANDUNG
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' }, // E - CIREBON
                { 'B', 'O', 'G', 'O', 'R' }, // F - BOGOR
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' }, // G - PEKALONGAN
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, // H - SEMARANG
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' }, // L - SURABAYA
                { 'M', 'A', 'L', 'A', 'N', 'G' }, // N - MALANG
                { 'T', 'E', 'G', 'A', 'L' } // T - TEGAL
        };

        // input dari user
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode Plat Nomor : ");
        char inputKode = sc.next().toUpperCase().charAt(0);
        sc.close();

        // proses pencarian
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                index = i;
                break;
            }

        }

        // output
        if (index != -1) {
            System.out.print("Kode " + inputKode + " merupakan plat nomor dari kota ");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.print(KOTA[index][i]);
            }
        } else {
            System.out.println("Kode plat nomor tidak ditemukan");
        }
    }
}
