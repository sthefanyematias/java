import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double expoente = scanner.nextDouble();
        System.out.println("Resultado: " + Math.pow(base, expoente));
        scanner.close();
    }
}
