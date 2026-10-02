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
                continue;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak");
                continue;
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

        } while (nilai != SELESAI);


        }
    }




