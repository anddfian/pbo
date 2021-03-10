import java.util.Scanner;

public class NilaiAkhir002 {
    public static void main(String[] args) {
        double tugas, kuis, uts, uas, nilai_akhir;
        String nilai_huruf;
        Scanner scan = new Scanner(System.in);

        System.out.print("Tugas: ");
        tugas = scan.nextInt();
        tugas *= 0.15;

        System.out.print("Kuis: ");
        kuis = scan.nextInt();
        kuis *= 0.20;

        System.out.print("UTS: ");
        uts = scan.nextInt();
        uts *= 0.30;

        System.out.print("UAS: ");
        uas = scan.nextInt();
        uas *= 0.35;

        nilai_akhir = tugas + kuis + uts + uas;
        System.out.println("Nilai Akhir: " + nilai_akhir);

        if(nilai_akhir > 80) {
            nilai_huruf = "A";
        } else if(nilai_akhir > 60) {
            nilai_huruf = "B";
        } else if(nilai_akhir > 40) {
            nilai_huruf = "C";
        } else if(nilai_akhir > 20) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }
        System.out.println("Nilai Huruf: " + nilai_huruf);
    }
}
