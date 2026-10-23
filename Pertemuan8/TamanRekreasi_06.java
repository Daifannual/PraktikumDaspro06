//p = 6
//Harga pertiket kode 1 Regular = 35000 + 0 x 5000 = 35000
//Harga pertiket kode 2 terusan = 60000 + 0 x 5000 = 60000
//Harga pertiket kode 3 pelajar = 25000 + 0 x 5000 = 25000
//T1 = 6 + 1 = 7
//T2 = 15 + 1 = 16

package Pertemuan8;

import java.util.Scanner;

public class TamanRekreasi_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaLayanan = "";
        int kodeTiket, jmlTiket, hargaPerTiket = 0, totalAwal;
        double hargaDiskon = 0, hargaDiskonTambahan = 0, totalFinal;
        boolean isMember;

        System.out.println("=== TIKET TAMAN REKREASI===");
        System.out.println("Kategori tiket : ");
        System.out.println("1. Regular");
        System.out.println("2. Terusan");
        System.out.println("3. Pelajar");
        System.out.print("Masukkan opsi tiket : ");
        kodeTiket = sc.nextInt();
        System.out.print("\nMasukkan jumlah tiket (max 30 tiket): ");
        jmlTiket = sc.nextInt();
        System.out.print("\nApakah memiliki kartu member? (true/false) : ");
        isMember = sc.nextBoolean();

        switch (kodeTiket) {
            case 1:
                hargaPerTiket = 35000;
                namaLayanan = "Regular";
                break;
            case 2:
                hargaPerTiket = 60000;
                namaLayanan = "Terusan";
                break;
            case 3:
                hargaPerTiket = 25000;
                namaLayanan = "Pelajar";
                break;
            default:
                System.out.println("Kode tidak dikenal");
                System.exit(0);
                break;
        }

        totalAwal = hargaPerTiket * jmlTiket;

        if (jmlTiket > 0 && jmlTiket <= 30) {
            if (jmlTiket <= 7) {
                hargaDiskon = totalAwal * 0;
            } else if (jmlTiket <= 16) {
                hargaDiskon = totalAwal * 0.1;
            } else {
                hargaDiskon = totalAwal * 0.2;
            }
        } else {
            System.out.println("Input tidak valid");
        }

        if (isMember == true || kodeTiket == 3) {
            hargaDiskonTambahan = totalAwal * 0.05;
        }

        totalFinal = totalAwal - hargaDiskon - hargaDiskonTambahan;

        System.out.println("Layanan : " + namaLayanan);
        System.out.println("Biaya Dasar : " + totalAwal);
        System.out.println("harga Diskon : " + hargaDiskon);
        System.out.println("Biaya akhir : " + totalFinal);
        sc.close();
    }
}
