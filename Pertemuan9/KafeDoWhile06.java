//p = 6
//hargaKopi = 10000 + (P mod 5) 1 × 1000 = 11000 → gantikan Rp12.000 pada soal
//hargaTeh = 5000 + (P mod 4) 2 × 1000 = 7000 → gantikan Rp7.000 pada soal
//hargaRoti = 15000 + (P mod 6) 0 × 1000 = 15000 → gantikan Rp20.000 pada soal

package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, hargaKopi = 11000, hargaTeh = 7000, hargaRoti = 15000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
