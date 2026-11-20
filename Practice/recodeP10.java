package Practice;

import java.util.Scanner;

public class recodeP10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlToko = 0;

        do {
            System.out.print("Masukkan Jumlah Toko (minimal 1): ");
            jmlToko = sc.nextInt();
            if (jmlToko < 1) {
                System.out.println("Jumlah pelanggan tidak valid!");
            }
        } while (jmlToko <= 0);
        
        int totalSemuaToko = 0;
        int terbanyak = -1;
        int tokoTerbanyak = 1;
        
        for (int i = 1; i <= jmlToko; i++) {
            System.out.println("\nData toko " + i);

            int jmlPelanggan;
            do {
                System.out.print("Jumlah pelanggan toko " + i + " : ");
                jmlPelanggan = sc.nextInt();
                if (jmlPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak valid!");
                }
            } while (jmlPelanggan < 0);
            
            int totalPerToko = 0;
            
            for (int j = 1; j <= jmlPelanggan; j++) {
                int jmlBarang;
                do {
                    System.out.print("Jumlah barang pelanggan " + j + " : ");
                    jmlBarang = sc.nextInt();
                    if (jmlBarang < 0) {
                        System.out.println("Jumlah barang tidak valid!");
                    }
                } while (jmlBarang < 0);

                totalPerToko += jmlBarang;
            }

            System.out.println("Jumlah pelanggan : "+ jmlPelanggan);
            System.out.println("Total Barang : "+ totalPerToko);

            totalSemuaToko += totalPerToko;

            if (totalPerToko > terbanyak) {
                terbanyak = totalPerToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Penjualan semua toko : " + totalSemuaToko);
        System.out.println("Toko terlaris : " + tokoTerbanyak);

    } 
}
