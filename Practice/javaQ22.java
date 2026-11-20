package Practice;

import java.util.Scanner;

public class javaQ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlRuangan;

        do {
            System.out.print("Input jumlah ruangan (minimal 1): ");
            jmlRuangan = sc.nextInt();
        } while (jmlRuangan < 1);

        int overload, borosDaya;
        String status = "";
        int jmlStatus = 0;
        int jmlBoros = 0;

        for (int i = 1; i <= jmlRuangan; i++) {
            System.out.println("\n--- Ruang ke-" + i + "---");
            int jmlPerangkat;

            do {
                System.out.print("Input jumlah perangkat (minimal 1): ");
                jmlPerangkat = sc.nextInt();
            } while (jmlPerangkat < 1);

            int totalDaya = 0;

            for (int j = 1; j <= jmlPerangkat; j++) {
                int wattDaya;

                do {
                    System.out.print("Input daya watt perangkat (range 10-5000): ");
                    wattDaya = sc.nextInt();
                    if (wattDaya < 10 || wattDaya > 5000) {
                        System.out.println("Input diluar ketentuan!");
                    }
                } while (wattDaya < 10 || wattDaya > 5000);

                totalDaya += wattDaya;
                if (wattDaya > 1000) {
                    jmlBoros++;
                }
            }
            if (totalDaya > 3500) {
                status = "OVERLOAD";
                jmlStatus++;
            } else {
                status = "AMAN";
            }

            System.out.println("Total daya ruangan ke-" + i + ": " + totalDaya);
            System.out.println("Status ruangan ke-" + i + ": " + status);
        }

        System.out.println("\n=== REKAP DAYA ===");
        System.out.println("Jumlah ruangan OVERLOAD : " + jmlStatus);
        System.out.println("Jumlah perangkat boros : " + jmlBoros);
    }
}

// jmlRuangan < 1, jmlPerangkat < 1, wattDaya (10-5000)
