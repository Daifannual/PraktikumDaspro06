package Practice;

import java.util.Scanner;

/**
 * calc
 */
public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1, angka2, hasil = 0;
        String operator;

        System.out.print("Masukkan angka 1 : ");
        angka1 = sc.nextInt();
        System.out.print("Masukkan Operasi : ");
        operator = sc.next();
        System.out.print("Masukkan angka 2 : ");
        angka2 = sc.nextInt();

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                if (angka1 > 0 && angka2 > 0) {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("operator pantek gaada");
                break;
        }
        System.out.println(hasil);
    }
}

// # STUDI KASUS JAVA: SISTEM KASIR MINIMARKET

// ## A. Deskripsi Studi Kasus

// Sebuah minimarket ingin membuat program kasir sederhana menggunakan bahasa
// pemrograman Java. Program ini digunakan untuk menghitung total belanja
// pelanggan berdasarkan kategori barang, jumlah pembelian, status keanggotaan,
// serta metode pembayaran.

// Program harus menerapkan percabangan `if else`, `nested if` (if bersarang),
// dan `switch case`.

// ## B. Ketentuan Program

// ### 1. Input Data Pelanggan

// Program meminta pengguna memasukkan data berikut:

// - Nama pelanggan.
// - Kategori barang yang dibeli.
// - Harga barang per unit.
// - Jumlah barang yang dibeli.
// - Status keanggotaan pelanggan.
// - Metode pembayaran.

// ### 2. Kategori Barang (`switch case`)

// Pelanggan dapat memilih kategori barang berikut:

// | Kode | Kategori | Harga per unit |
// |---|---|---:|
// | 1 | Makanan | Rp15.000 |
// | 2 | Minuman | Rp10.000 |
// | 3 | Peralatan mandi | Rp25.000 |
// | 4 | Alat tulis | Rp5.000 |

// Program menentukan nama kategori dan harga barang berdasarkan kode yang
// dipilih.

// Jika pelanggan memasukkan kode selain 1–4, program menampilkan pesan
// **"Kategori barang tidak valid!"** dan proses belanja tidak dilanjutkan.

// ### 3. Menghitung Total Belanja

// Total belanja dihitung dengan rumus:

// Total Belanja = Harga Barang × Jumlah Barang

// Jumlah barang yang dibeli harus lebih dari 0. Jika jumlah barang kurang dari
// atau sama dengan 0, program menampilkan pesan **"Jumlah barang tidak
// valid!"**.

// ### 4. Menentukan Diskon (`if else`)

// Diskon ditentukan berdasarkan total belanja sebelum diskon:

// - Total belanja minimal Rp100.000 mendapatkan diskon 10%.
// - Total belanja minimal Rp50.000 tetapi kurang dari Rp100.000 mendapatkan
// diskon 5%.
// - Total belanja kurang dari Rp50.000 tidak mendapatkan diskon.

// ### 5. Diskon Keanggotaan (`nested if`)

// Program menanyakan apakah pelanggan memiliki kartu member.

// - Jika pelanggan **memiliki member**, periksa total belanjanya:
// - Total belanja minimal Rp100.000 mendapatkan diskon tambahan 5%.
// - Total belanja kurang dari Rp100.000 mendapatkan diskon tambahan 2%.
// - Jika pelanggan **tidak memiliki member**, pelanggan tidak mendapatkan
// diskon keanggotaan.

// Diskon keanggotaan dihitung berdasarkan total belanja awal, bukan berdasarkan
// sisa belanja setelah diskon pertama.

// ### 6. Metode Pembayaran (`switch case`)

// Pelanggan memilih metode pembayaran:

// | Kode | Metode Pembayaran | Ketentuan |
// |---|---|---|
// | 1 | Tunai | Tidak ada biaya tambahan |
// | 2 | Debit | Tidak ada biaya tambahan |
// | 3 | E-wallet | Mendapat potongan tambahan Rp2.000 jika total setelah diskon
// minimal Rp50.000 |

// Jika kode pembayaran tidak valid, program menampilkan pesan kesalahan.

// ### 7. Menentukan Status Belanja (`if else`)

// Setelah semua diskon dihitung, program memeriksa total pembayaran akhir:

// - Jika total pembayaran minimal Rp100.000, tampilkan **"Belanja Besar"**.
// - Jika total pembayaran minimal Rp50.000 tetapi kurang dari Rp100.000,
// tampilkan **"Belanja Sedang"**.
// - Jika total pembayaran kurang dari Rp50.000, tampilkan **"Belanja Kecil"**.

// ### 8. Output Program

// Program harus menampilkan:

// 1. Nama pelanggan.
// 2. Kategori barang.
// 3. Harga per unit.
// 4. Jumlah barang.
// 5. Total belanja sebelum diskon.
// 6. Diskon belanja.
// 7. Diskon member.
// 8. Potongan e-wallet jika memenuhi syarat.
// 9. Total pembayaran akhir.
// 10. Metode pembayaran.
// 11. Status belanja.

// ---

// ## C. Input dan Tipe Data Java

// | Variabel | Tipe Data | Keterangan |
// |---|---|---|
// | `namaPelanggan` | `String` | Nama pelanggan |
// | `kodeBarang` | `int` | Kode kategori barang |
// | `kategoriBarang` | `String` | Nama kategori barang |
// | `hargaBarang` | `int` | Harga satuan barang |
// | `jumlahBarang` | `int` | Jumlah barang yang dibeli |
// | `totalBelanja` | `int` | Total sebelum diskon |
// | `diskonBelanja` | `double` | Nominal diskon belanja |
// | `diskonMember` | `double` | Nominal diskon member |
// | `punyaMember` | `boolean` | Status keanggotaan |
// | `kodePembayaran` | `int` | Kode metode pembayaran |
// | `metodePembayaran` | `String` | Nama metode pembayaran |
// | `potonganEwallet` | `int` | Potongan e-wallet |
// | `totalBayar` | `double` | Total pembayaran akhir |
// | `statusBelanja` | `String` | Kategori belanja pelanggan |

// Catatan: nominal uang dapat menggunakan `int` atau `double` untuk latihan
// ini. Jika menggunakan `double`, tampilkan hasil dengan format rupiah tanpa
// angka desimal.

// ---

// ## D. Contoh Output Program

// **Contoh 1 — Pelanggan mendapat diskon belanja, diskon member, dan potongan
// e-wallet**

// ```text
// ===== KASIR MINIMARKET =====

// Masukkan nama pelanggan: Fadhil

// Pilih kategori barang:
// 1. Makanan
// 2. Minuman
// 3. Peralatan mandi
// 4. Alat tulis
// Masukkan kode barang: 1

// Masukkan jumlah barang: 8

// Apakah memiliki kartu member? (true/false): true

// Pilih metode pembayaran:
// 1. Tunai
// 2. Debit
// 3. E-wallet
// Masukkan kode pembayaran: 3

// ===== STRUK BELANJA =====
// Nama pelanggan : Fadhil
// Kategori barang : Makanan
// Harga per unit : Rp15.000
// Jumlah barang : 8
// Total belanja : Rp120.000
// Diskon belanja (10%) : Rp12.000
// Diskon member (5%) : Rp6.000
// Potongan e-wallet : Rp2.000
// --------------------------------
// Total pembayaran : Rp100.000
// Metode pembayaran : E-wallet
// Status belanja : Belanja Besar

// Terima kasih telah berbelanja!
// ```

// **Contoh 2 — Pelanggan tidak memiliki member**

// ```text
// ===== STRUK BELANJA =====
// Nama pelanggan : Andi
// Kategori barang : Minuman
// Harga per unit : Rp10.000
// Jumlah barang : 6
// Total belanja : Rp60.000
// Diskon belanja (5%) : Rp3.000
// Diskon member : Rp0
// Potongan e-wallet : Rp0
// --------------------------------
// Total pembayaran : Rp57.000
// Metode pembayaran : Tunai
// Status belanja : Belanja Sedang

// Terima kasih telah berbelanja!
// ```

// **Contoh 3 — Kategori barang tidak valid**

// ```text
// ===== KASIR MINIMARKET =====
// Masukkan nama pelanggan: Budi

// Pilih kategori barang:
// 1. Makanan
// 2. Minuman
// 3. Peralatan mandi
// 4. Alat tulis
// Masukkan kode barang: 7

// Kategori barang tidak valid!
// Transaksi dibatalkan.
// ```

// ---

// ## E. Tugas yang Harus Dikerjakan

// 1. Buat program Java berdasarkan ketentuan di atas.
// 2. Gunakan `switch case` untuk menentukan kategori barang dan metode
// pembayaran.
// 3. Gunakan `if else` untuk menentukan diskon belanja dan status belanja.
// 4. Gunakan `nested if` untuk memeriksa status member dan menentukan diskon
// tambahan.
// 5. Pastikan program menangani input yang tidak valid.
// 6. Uji program menggunakan minimal tiga skenario pembelian yang berbeda.