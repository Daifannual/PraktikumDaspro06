package Practice;

import java.util.Scanner;

public class latihanQuiz22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah kantin : ");
        int jmlKantin = sc.nextInt();
        System.out.print("Jumlah hari   : ");
        int jmlHari = sc.nextInt();

        if (jmlKantin <= 0 || jmlHari <= 0) {
            System.out.println("Jumlah kantin dan hari harus > 0.");
        } else {
            int totalSeluruhKantin = 0;
            int maxPendapatan = -1; 
            int kantinTerbaik = 1;
            int hariSepi = 0;

            int i = 1;
            while (i <= jmlKantin) {
                System.out.println("Kantin " + i);
                
                int totalKantin = 0;

                for (int j = 1; j <= jmlHari; j++) {
                    int pendapatan;

                    do {
                        System.out.print("Pendapatan hari ke-" + j + " : ");
                        pendapatan = sc.nextInt();
                        if (pendapatan < 0) {
                            System.out.println("Tidak boleh negatif. Ulangi input!");
                        }
                    } while (pendapatan < 0);

                    totalKantin += pendapatan;

                    if (pendapatan < 100) {
                        hariSepi++;
                    }
                }

                double rataRata = (double) totalKantin / jmlHari;
                System.out.println("Kantin " + i + " - total: " + totalKantin + ", rata-rata per hari: " + rataRata);

                totalSeluruhKantin += totalKantin;

                if (totalKantin > maxPendapatan) {
                    maxPendapatan = totalKantin;
                    kantinTerbaik = i;
                }

                i++;
            }

            System.out.println("==============================");
            System.out.println("Total seluruh kantin : " + totalSeluruhKantin);
            System.out.println("Kantin terbaik       : " + kantinTerbaik);
            System.out.println("Hari sepi (< 100)    : " + hariSepi);
        }

        sc.close();
    }
}
