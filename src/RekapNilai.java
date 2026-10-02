import java.util.Scanner;

public class RekapNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SELESAI = -1;
        int jumlah = 0;
        double total = 0;
        int nilai = 0;

        do {
            System.out.print("Nilai ke-" + (jumlah + 1) + " : ");
            nilai = sc.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak");
                continue;
                //perintah untuk perhentian angka -1.
            }


            char grade;
            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }
            //kalau kita memasukkan angka 101 atau lebih akan di tolak, dan kembali lagi menjadi nomor 1.
            //kalau di input angka 0-100 angka akan terus berjalan. Angka yang kita masukkan akana muncul grade dan keterangannya
            //Kalau >= 60 yang di paling atas hasil dari 85 itu Grade :D - Kurang
            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Gagal";
            };
            System.out.println("  Grade " + grade + " — " + keterangan);

            total += nilai;
            jumlah++;

        } while (true);


        System.out.println();
        System.out.println("Nilai yang sebenarnya   : " + jumlah);

        if (jumlah > 0) {
            double rata = total / jumlah;
            String status = rata >= 60 ? "LULUS" : "Tidak Lulus";
            //Kalau rata-ratanya 60 ke atas akan dinyatakan lulus, tetapi kalau nilai rata-ratanya 59 ke bawah akan di nyatakan tidak lulus
            System.out.println("Rata-rata   : " + String.format("%.2f", rata));
            System.out.println("Status      : " + status);
        }

        sc.close();
    }
}
