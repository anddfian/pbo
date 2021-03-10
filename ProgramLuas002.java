import java.util.Scanner;

public class ProgramLuas002 {
    public static void main(String[] args) {
        double a, t, s, luas;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Panjang Alas: ");
        a = scan.nextDouble();
        System.out.print("Masukkan Tinggi Segitiga: ");
        t = scan.nextDouble();
        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga adalah " + luas + " cm");
        System.out.print("Masukkan Sisi : ");
        s = scan.nextDouble();
        luas = 6 * (s * s);
        System.out.println("Luas Permukaan Kubus adalah " + luas + " cm");
    }
}
