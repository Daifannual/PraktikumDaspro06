package Pertemuan10;

import java.util.Scanner;

public class Tugas106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, total = 0;

        System.out.print("Masukkan nilai n = ");
        nilai = sc.nextInt();

        for (int i = 0; i < nilai; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
                total++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        sc.close(); 
    }
}
