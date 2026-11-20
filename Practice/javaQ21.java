package Practice;

import java.util.Scanner;

public class javaQ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlCabang;
        do {
            System.out.print("Masukkkan jumlah cabang (minimal 1) : ");
            jmlCabang = sc.nextInt();
        } while (jmlCabang < 1);

        double totalSemuaOmzet = 0;
        double lowestOmzet = Double.MAX_VALUE;
        int cabangSepi = 1;

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n--- Cabang ke-" + i + "---");
            int jmlTransaksi;

            do {
                System.out.print("Masukkkan jumlah transaksi : ");
                jmlTransaksi = sc.nextInt();
                if (jmlTransaksi < 0) {
                        System.out.println("Jangan negatif!");
                    }
            } while (jmlTransaksi < 0);

            double totalOmzet = 0;
            int isDiskon = 0;

            for (int j = 1; j <= jmlTransaksi; j++) {
                double totalBelanja;
                do {
                    System.out.print("Masukkkan total belanja transaksi ke-" + j + " : ");
                    totalBelanja = sc.nextInt();
                    if (totalBelanja < 1000) {
                        System.out.println("Minimal input 1000!");
                    }
                } while (totalBelanja < 1000);

                if (totalBelanja >= 100000) {
                    totalBelanja = totalBelanja - (totalBelanja * 0.1);
                    isDiskon++;
                }

                totalOmzet += totalBelanja;
            }

            System.out.println("Total omzet cabang ke-"+i+": "+ totalOmzet);
            System.out.println("transaksi dapat diskon: "+ isDiskon);

            totalSemuaOmzet += totalOmzet;
            if (totalOmzet < lowestOmzet) {
                lowestOmzet = totalOmzet;
                cabangSepi = i;
            }
        }

        System.out.println("\n== REKAPITULASI AKHIR ==");
        System.out.println("Total omzet semua cabang : "+ totalSemuaOmzet);
        System.out.println("Cabang tersepi : "+ cabangSepi);
    }
}

// jmlCab <1, tiapCab <0, transak <1000