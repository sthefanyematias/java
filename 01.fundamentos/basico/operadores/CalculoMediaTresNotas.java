import java.util.Scanner;

public class CalculoMediaTresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Media: " + media);
        scanner.close();
    }
}
