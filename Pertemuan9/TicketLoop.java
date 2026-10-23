// Ketentuan (P = 6):
// Harga tiket = Rp40.000 per tiket
// Pembelian lebih dari 3 tiket mendapatkan diskon 9%
// Pembelian lebih dari 10 tiket mendapatkan diskon 17%

package Pertemuan9;

import java.util.Scanner;

public class TicketLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, totalTiket = 0, i = 0;
        double diskon = 0, totalPendapatan = 0, hargaTiket = 40000;
        
        System.out.println("=== Sistem Penjualan Tiket ===");
        System.out.println("Ketik '0' pada jumlah tiket untuk mengakhiri program harian.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan ke "+ (i+1) +"(0 untuk mengakhiri program) : ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }
            
            if (jmlTiket == 0) {
                break;
            }

            double totalHarga = jmlTiket * hargaTiket;

            if (jmlTiket > 10) {
                diskon = 0.17;
            } else if (jmlTiket > 3){
                diskon = 0.09;
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            totalTiket += jmlTiket;
            totalPendapatan += totalHarga;

            System.out.println("Diskon : " + (int)(diskon * 100) + "%");
            System.out.println("Total harga       : Rp " + totalHarga + "\n");;

            i++;
        }
        System.out.println("\n=== Rekap Penjualan ===");
        System.out.println("Total Pendapatan hari ini : " + totalPendapatan);
        System.out.println("Total Tiket terjual hari ini : " + totalTiket);
    }
}
