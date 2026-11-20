package Pertemuan12;

import java.util.Scanner;

public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out
                        .println("Nilai " + key + " ditemukan pada indeks ke-" + i + " (mahasiswa ke-" + (i + 1) + ")");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
