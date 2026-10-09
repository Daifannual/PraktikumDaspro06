package Pertemuan6;

import java.util.Scanner;

public class TugasBuku06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku: ");
        String jenis = sc.nextLine().trim();
        System.out.print("Masukkan jumlah buku: ");
        int jumlah = sc.nextInt();

        int diskon = 0;

        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 9;
            if (jumlah > 2) {
                diskon = diskon + 2;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlah > 3) {
                diskon = diskon + 2;
            } else {
                diskon = diskon + 1;
            }
        } else if (!jenis.equalsIgnoreCase("kamus") && !jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Output: diskon (" + diskon + "%)");

        sc.close();
    }
}