import java.util.Scanner;

public class ClassificaNotaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("A");
        } else if (nota >= 8) {
            System.out.println("B");
        } else if (nota >= 7) {
            System.out.println("C");
        } else if (nota >= 5) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
