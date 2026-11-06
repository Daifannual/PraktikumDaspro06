package Pertemuan10;

import java.util.Scanner;

public class Tugas206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nilai, total = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                nilai = j * (i + 1);
                System.out.print(nilai + "\t");
                total += nilai;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + total);
        sc.close();
    }
}
