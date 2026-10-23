// Ketentuan (P = 6):
// - Tarif parkir mobil (jenis 1) = Rp2.500 per jam
// - Tarif parkir motor (jenis 2) = Rp1.500 per jam

package Pertemuan9;
import java.util.Scanner;

public class ParkingLoop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifMobil = 2500;
        int tarifMotor = 1500;

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * tarifMobil;
                } else {
                    total += durasi * tarifMotor;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}
