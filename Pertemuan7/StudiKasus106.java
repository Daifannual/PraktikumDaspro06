import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();
        
        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;
        
        if (totalHarga >= 100000) {
            diskon = (totalHarga*10)/100;
        }
        
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga\t: " + "Rp " + totalHarga);
        System.out.println("Diskon\t\t: " + "Rp " + diskon);
        System.out.println("Total bayar\t: " + "Rp " + totalBayar);


        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian" + "Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, Kurang Rp " + kurang);
        }

        sc.close();
    }
}