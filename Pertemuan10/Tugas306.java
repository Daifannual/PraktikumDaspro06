package Pertemuan10;

import java.util.Scanner;

public class Tugas306 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahToko;
        
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Input tidak valid! Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1; 
        int tokoTerbanyak = 1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Data Toko " + i + " ---");
            
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan di Toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Input tidak valid! Tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print("  Jumlah barang dibeli pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("  Input tidak valid! Tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);
                
                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\n=== Ringkasan Pusat Perbelanjaan ===");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        
        sc.close();
    }
}
