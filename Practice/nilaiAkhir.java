package Practice;

import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, status, kategori= "";
        double tugas, uts, uas, nilaiAkhir, bobotTgs = 0.3, bobotUts = 0.3, bobotUas = 0.4;
        boolean isLulus = true;
        
        System.out.println("SISTEM PENILAIAN");
        System.out.println("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.println("Masukkan nim  : ");
        nim = sc.nextLine();
        System.out.println("Masukkan nilai tugas : ");
        tugas = sc.nextDouble();
        System.out.println("Masukkan nilai uts : ");
        uts = sc.nextDouble();
        System.out.println("Masukkan nilai uas : ");
        uas = sc.nextDouble();

        nilaiAkhir = (tugas * bobotTgs) + (uts*bobotUts) + (uas*bobotUas);
        if (nilaiAkhir < 0 || nilaiAkhir > 100) {
            System.out.println("Nilai tidak valid");
            isLulus = false;
            kategori = "Tidak valid";
        } else if (nilaiAkhir < 60) {
            kategori = "D";
            isLulus = false;
        } else if (nilaiAkhir >= 60 && nilaiAkhir <= 74.99) {
            kategori = "C";
        } else if (nilaiAkhir >= 75 && nilaiAkhir <= 84.99) {
            kategori = "B";
        } else if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            kategori = "A";
        } else {
            System.out.println("Nilai tidak valid");
        }

        if (isLulus == true) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("===Report nilai===");
        System.out.println("nama : " + nama );
        System.out.println("nim : " + nim );
        System.out.println("nilaiAkhir : " + nilaiAkhir );
        System.out.println("kategori : " + kategori );
        System.out.println("Status : " + status);
    }
}
