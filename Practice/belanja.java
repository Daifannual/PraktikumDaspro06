package Practice;

import java.util.Scanner;

public class belanja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, namaKategori = "", namaMtdBayar = "", statusBelanja = "";
        int kategori, jumlahBarang, mtdBayar;
        int hargaPerUnit = 0;
        double diskonBelanja, diskonMember = 0, diskonMtdBayar = 0, totalAfterDiskon, totalBelanja = 0,
                totalBelanjaFinal;
        boolean isMember;

        System.out.print("Masukkan nama pelanggan : ");
        name = sc.nextLine();
        System.out.println("\nKategori barang : ");
        System.out.println("1. Makanan ");
        System.out.println("2. Minuman ");
        System.out.println("3. Peralatan mandi ");
        System.out.println("4. Alat tulis ");
        System.out.print("Pilih opsi barang : ");
        kategori = sc.nextInt();
        System.out.print("\nMasukkan Jumlah Barang : ");
        jumlahBarang = sc.nextInt();
        System.out.print("\nPunya member? (true/false) : ");
        isMember = sc.nextBoolean();
        System.out.println("\nMetode bayar : ");
        System.out.println("1. Tunai ");
        System.out.println("2. Debit ");
        System.out.println("3. E-wallet ");
        System.out.print("Pilih opsi bayar : ");
        mtdBayar = sc.nextInt();

        switch (kategori) {
            case 1:
                hargaPerUnit = 15000;
                namaKategori = "Makanan";
                break;
            case 2:
                hargaPerUnit = 10000;
                namaKategori = "Minuman";
                break;
            case 3:
                hargaPerUnit = 25000;
                namaKategori = "Peralatan mandi";
                break;
            case 4:
                hargaPerUnit = 5000;
                namaKategori = "Alat tulis";
                break;
            default:
                System.out.println("Kateogri tidak valid");
                System.exit(0);
                break;
        }

        if (jumlahBarang > 0) {
            totalBelanja = hargaPerUnit * jumlahBarang;
        } else {
            System.out.println("Jumlah barang tidak valid");
            System.exit(0);
        }

        if (totalBelanja < 50000) {
            diskonBelanja = 0;
        } else if (totalBelanja < 100000) {
            diskonBelanja = totalBelanja * 0.05;
        } else {
            diskonBelanja = totalBelanja * 0.1;
        }

        if (isMember == true) {
            if (totalBelanja < 100000) {
                diskonMember = totalBelanja * 0.02;
            } else {
                diskonMember = totalBelanja * 0.05;
            }
        }

        totalAfterDiskon = totalBelanja - diskonBelanja - diskonMember;

        switch (mtdBayar) {
            case 1:
                namaMtdBayar = "tunai";
                break;
            case 2:
                namaMtdBayar = "debit";
                break;
            case 3:
                namaMtdBayar = "E-wallet";
                if (totalAfterDiskon >= 50000) {
                    diskonMtdBayar = 2000;
                }
                break;
            default:
                System.out.println("Metode Ga valid");
                System.exit(0);
                break;
        }

        totalBelanjaFinal = totalAfterDiskon - diskonMtdBayar;

        if (totalBelanjaFinal < 50000) {
            statusBelanja = "Belanja Kecil";
        } else if (totalBelanjaFinal < 100000) {
            statusBelanja = "Belanja Sedang";
        } else {
            statusBelanja = "Belanja Besar";
        }

        System.out.println("=== STRUK BELANJA ===");
        System.out.println("Nama Pelanggan : " + name);
        System.out.println("Kategori : " + namaKategori);
        System.out.println("Harga /unit : Rp" + hargaPerUnit);
        System.out.println("Jumlah baarang : " + jumlahBarang);
        System.out.println("total belanja : Rp" + totalBelanja);
        System.out.println("diskon Belanja 10% : Rp" + diskonBelanja);
        System.out.println("diskon member 5% : Rp" + diskonMember);
        System.out.println("potongan ewallet : Rp" + diskonMtdBayar);
        System.out.println("-----------------------------");
        System.out.println("Total harus dibayar : Rp" + totalBelanjaFinal);
        System.out.println("Metode bayar : " + namaMtdBayar);
        System.out.println("Status belanja : " + statusBelanja);
        System.out.println("\nMakasih sudah belanja");
        sc.close();
    }
}
