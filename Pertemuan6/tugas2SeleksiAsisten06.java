package Pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Daspro: ");
            int nilaiDaspro = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            if (nilaiDaspro >= 81 || punyaSertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 76) {
                    System.out.println("Selamat! Anda diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 76.");
                }
            } else {
                System.out.println("Gagal! Nilai Daspro kurang dari 81 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Gagal! Status mahasiswa tidak aktif atau sedang menerima sanksi akademik.");
        }

        sc.close();
    }
}