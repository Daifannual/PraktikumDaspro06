import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlDokumen, peringkat;
        String namaMhs, jenisKeg, pesan;

        System.out.print("Nama mahasiswa : ");
        namaMhs = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKeg = sc.next();

        if (jenisKeg.equalsIgnoreCase("BELMAWA") || jenisKeg.equalsIgnoreCase("BAKORMA")
                || jenisKeg.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jmlDokumen = sc.nextInt();
            System.out.print("Peringkat : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jmlDokumen < 4) {
                    jmlDokumen = 4 - jmlDokumen;
                    pesan = "Dokumen tidak lengkap (kurang " + jmlDokumen
                            + " dokumen). Dana penghargaan tidak diberikan.";
                } else {
                    pesan = "dana diberikan";
                }
            } else {
                pesan = "anda bukan peraih peringkat 1-3. Dana penghargaan tidak diberikan.";
            }
        } else {
            pesan = "Diluar kegiatan yang tersedia";
        }

        System.out.println(pesan);
    }
}