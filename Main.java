import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + ".");
    }
}