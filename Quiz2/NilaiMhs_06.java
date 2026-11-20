package Quiz2;

import java.util.Scanner;

import Practice.nilaiAkhir;

public class NilaiMhs_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tambahMhs;

        do {
            String nama;
            int kuis, uts, uas, tugas = 0, jmlTugas = 2;
            double nilaiAkhir = 0;

            System.out.print("Nama mahasiswa: ");
            nama = sc.nextLine();
            System.out.print("Nilai Kuis: ");
            kuis = sc.nextInt();
            System.out.print("Nilai uts: ");
            uts = sc.nextInt();
            System.out.print("Nilai uas: ");
            uas = sc.nextInt();

            double totalTugas = 0;
            double rataTugas = 0;
            String status = "";

            for (int i = 1; i <= jmlTugas; i++) {
                do {
                    System.out.print("Nilai tugas " + i + ": ");
                    tugas = sc.nextInt();
                    if (tugas < 0 || tugas > 100) {
                        System.out.println("Nilai tidak valid, Ulangi!");
                        continue;
                    } else {
                        totalTugas += tugas;
                    }
                } while (tugas < 0 || tugas > 100);
            }

            rataTugas = totalTugas / jmlTugas;

            nilaiAkhir = (kuis * 0.35) + (uts * 0.15) + (uas * 0.30) + (rataTugas * 0.20);

            if (nilaiAkhir > 50) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }

            System.out.println("Rata-rata tugas: " + rataTugas);
            System.out.println("Nilai Akhir: \t:" + nilaiAkhir);
            System.out.println("Status \t:" + status);

            System.out.println("Tambah mahasiswa? (y/t): ");
            tambahMhs = sc.next().charAt(0);
        } while (tambahMhs == 'y' || tambahMhs == 'Y');
    }
}
