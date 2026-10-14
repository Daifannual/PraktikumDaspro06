package Practice;

import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kendaraan, lamaParkir, tarif = 0;
        boolean member, helm, gopay;

        System.out.println("Pilih Jenis kendaraan : ");
        System.out.println("1. motor");
        System.out.println("2. mobil");
        kendaraan = sc.nextInt();
        System.out.print("Apakah punya kartu member (true/false)? : ");
        member = sc.nextBoolean();
        System.out.print("durasi parkir : ");
        lamaParkir = sc.nextInt();

        switch (kendaraan) {
            case 1:
                System.out.print("Apakah titip helm (true/false)? : ");
                helm = sc.nextBoolean();
                if (member == true) {
                    if (lamaParkir > 4 || helm == true) {
                        tarif = 4000;
                    } else {
                        tarif = 2000;
                    }
                } else {
                    if (lamaParkir > 4 && helm == true) {
                        tarif = 7000;
                    } else {
                        tarif = 5000;
                    }
                }
                break;
            case 2:
                System.out.print("pake gopay dak kau (true/false)? : ");
                gopay = sc.nextBoolean();
                if (member == true) {
                    if (lamaParkir > 4 && gopay == true) {
                        tarif = 15000;
                    } else {
                        tarif = 20000;
                    }
                } else {
                    if (lamaParkir > 4 || gopay == true) {
                        tarif = 35000;
                    } else {
                        tarif = 25000;
                    }
                }
                break;

            default:
                System.out.println("milih kendaraan yang ada aja kampang");
                break;
        }
        
        System.out.println("Total biaya parkuy : " + tarif);
    }
}
