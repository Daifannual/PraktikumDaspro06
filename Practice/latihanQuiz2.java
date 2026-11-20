package Practice;

import java.util.Scanner;

public class latihanQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlKelas;
        do {
            System.out.print("Masukkan jumlah kelas (minimal 1): ");
            jmlKelas = sc.nextInt();
        } while (jmlKelas < 1);

        int totalLulusSemuaKelas = 0;
        double maxRataRata = -1.0;
        int kelasTerbaik = 1;

        for (int i = 1; i <= jmlKelas; i++) {
            System.out.println("\n--- Kelas ke-" + i + " ---");
            int jmlMhs;
            do {
                System.out.print("Jumlah mahasiswa hadir di kelas ke-" + i + ": ");
                jmlMhs = sc.nextInt();
            } while (jmlMhs < 0);

            int totalNilaiKelas = 0;
            int lulusKelas = 0;

            for (int j = 1; j <= jmlMhs; j++) {
                int nilai;
                do {
                    System.out.print("  Nilai mahasiswa ke-" + j + " (0-100): ");
                    nilai = sc.nextInt();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println("  Nilai harus 0-100. Ulangi input!");
                    }
                } while (nilai < 0 || nilai > 100);

                totalNilaiKelas += nilai;
                if (nilai >= 75) {
                    lulusKelas++;
                }
            }

            double rataKelas = (jmlMhs > 0) ? (double) totalNilaiKelas / jmlMhs : 0.0;

            System.out.println("Rata-rata kelas ke-" + i + "       : " + rataKelas);
            System.out.println("Mahasiswa lulus kelas ke-" + i + " : " + lulusKelas);

            totalLulusSemuaKelas += lulusKelas;

            if (rataKelas > maxRataRata) {
                maxRataRata = rataKelas;
                kelasTerbaik = i;
            }
        }

        System.out.println("\n=== REKAPITULASI AKHIR ===");
        System.out.println("Total mahasiswa lulus seluruh kelas : " + totalLulusSemuaKelas);
        System.out.println("Kelas dengan rata-rata tertinggi    : Kelas ke-" + kelasTerbaik + " (" + maxRataRata + ")");

        sc.close();
    }
}