package Practice;

import java.util.Scanner;

/**
 * paketUts
 */
public class iBoxUts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Kategori;
        String member,payment;
        double diskon = 0;

        System.out.println("Pilih kategori : ");
        System.out.println("1. handphone");
        System.out.println("2. laptop");
        Kategori = sc.nextInt();
        System.out.println("Member gold atau regular? : ");
        member = sc.next();
        System.out.println("metode pembayaran (cash/qris) : ");
        payment = sc.next();

        switch (Kategori) {
            case 1:
                if (member.equalsIgnoreCase("gold")) {
                    if (payment.equalsIgnoreCase("cash")) {
                        diskon = 15;
                    } else if (payment.equalsIgnoreCase("qris")){
                        diskon = 10;
                    } else {
                        System.out.println("metode pembayaran tidak valid");
                    }
                } else if (member.equalsIgnoreCase("regular")) {
                    if (payment.equalsIgnoreCase("cash")) {
                        diskon = 5;
                    } else if (payment.equalsIgnoreCase("qris")){
                        diskon = 0;
                    } else {
                        System.out.println("metode pembayaran tidak valid");
                    }
                }
                break;
            case 2:
                if (member.equalsIgnoreCase("gold")) {
                    if (payment.equalsIgnoreCase("cash")) {
                        diskon = 2;
                    } else if (payment.equalsIgnoreCase("qris")){
                        diskon = 12;
                    } else {
                        System.out.println("metode pembayaran tidak valid");
                    }
                } else if (member.equalsIgnoreCase("regular")) {
                    if (payment.equalsIgnoreCase("cash")) {
                        diskon = 7;
                    } else if (payment.equalsIgnoreCase("qris")){
                        diskon = 2;
                    } else {
                        System.out.println("metode pembayaran tidak valid");
                    }
                } 
                break;
            default:
                System.out.println("kategori tidak valid");
                break;
        }

        System.out.println("Persentase diskon anda : " + (int)diskon + "%");
    }
}