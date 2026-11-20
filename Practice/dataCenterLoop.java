package Practice;

import java.util.Scanner;

public class dataCenterLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rak;

        do {
            System.out.print("Masukkan jumlah rak server (minimal 1) : ");
            rak = sc.nextInt();
            if (rak <= 0) {
                System.out.println("Input tidak valid");
            }
        } while (rak <= 0);
        
        int totalDaya = 0;
        int lowerWatt = 99999;
        int rakHematWatt = 1;
        
        for (int i = 1; i <= rak; i++) {
            System.out.println("\n-Data Rak Server " + i + "-");
            
            int unit;
            do {
                System.out.print("Masukkan jumlah unit server : ");
                unit = sc.nextInt();
                if (unit < 0) {
                    System.out.println("Input tidak valid");
                }        
            } while (unit < 0);
            
            int wattPerRak = 0;
            
            for (int j = 1; j <= unit; j++) {
                int watt;
                do {
                    System.out.print("Masukkan jumlah watt server : ");
                    watt = sc.nextInt();
                    if (watt < 0) {
                        System.out.println("Input tidak valid");
                    }
                } while (watt < 0);
                wattPerRak += watt;

            }
            totalDaya += wattPerRak;
            System.out.println("Total watt unit rak " +  i + " : " + wattPerRak);

            if (wattPerRak < lowerWatt) {
                lowerWatt = wattPerRak;
                rakHematWatt = i;
            }
        }

        System.out.println("Total daya digunakan semua unit : " + totalDaya);
        System.out.println("Rak dengan watt terrendah : " + rakHematWatt);
    }
}


//-data center : 
//rak server:
//unit server aktif: 
//watt